package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentIndonesianMigrantWorkerFillingFormRegisterBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerFillingFormRegisterFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.model.Job;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010\u0016\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 R.\u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010&R\u001a\u0010\u0012\u001a\u00020'8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\u0016\u0010)"}, d2 = {"LtryUnregisterOnBackInvokedCallback;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentIndonesianMigrantWorkerFillingFormRegisterBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannelDefault", "cancel", "INotificationSideChannel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "TuitionPaymentFragmentbindingInflater1", "()Z", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "a", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "b", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "asBinder", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Lazy;", "Landroid/widget/ArrayAdapter;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Calendar;", "asInterface", "Ljava/util/Calendar;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tryUnregisterOnBackInvokedCallback extends AutoValue_ImmutableImageInfo<FragmentIndonesianMigrantWorkerFillingFormRegisterBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CodeNamePair b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Job TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Calendar d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Calendar g;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$f = 127;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -50, -56, -93, 2, -21, 2, -11, -6, -23, -8, 28, -46, -11, -14, -8, 24, -43, -6, 3, -4, -11, -11, 42, -56, -22, 1, -23, -6, -3, -4, -29, 12, -7, -21, -1, -22, 8, -11, -21, -12, 4, -20, -11, -6, 3, -11, -23, -9, 1, -14, -2, 26, -42, -10, -4, -29, 0, -17, 24, -43, -6, 3, -4, -11, -11, 12, -43, -6, 3, -11, -23, -9, -5, -12, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56};
    private static final int $$e = 213;
    private static final byte[] $$a = {58, -51, 54, -115, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 61;
    private static int INotificationSideChannelStubProxy = 1;
    private static int cancel = 0;
    private static int cancelAll = 1;
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: ToolbarWidgetWrapper1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
            return (MigrantWorkerRegistration) tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentbindingInflater1(CaptureBundle.TuitionPaymentFragmentbindingInflater1(), CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, objArr, 190611718, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), -190611717);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: updateNavigationIcon
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
            return (ArrayAdapter) tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentbindingInflater1(CaptureBundle.TuitionPaymentFragmentbindingInflater1(), CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, objArr, -539351823, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), 539351827);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i6);
        int i8 = ~((~i6) | i4);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i4) | i6));
        int i11 = i6 + i4 + i + (762724209 * i5) + (1201824936 * i2);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i4) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i) + (1302855680 * i5) + (1514143744 * i2) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i4 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i * 162560975) + (i5 * 701011807) + (i2 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i15 == 3) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 != 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i16 = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(((tryUnregisterOnBackInvokedCallback) objArr[0]).requireContext(), R.layout.support_simple_spinner_dropdown_item);
        int i17 = cancel + 49;
        cancelAll = i17 % 128;
        int i18 = i17 % 2;
        return arrayAdapter;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.tryUnregisterOnBackInvokedCallback.$$a
            int r1 = r7 + 1
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tryUnregisterOnBackInvokedCallback.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 71
            int r7 = 75 - r7
            int r6 = r6 * 34
            int r0 = r6 + 38
            byte[] r1 = defpackage.tryUnregisterOnBackInvokedCallback.$$d
            int r8 = r8 * 24
            int r8 = 108 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L31:
            int r4 = -r4
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-9)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tryUnregisterOnBackInvokedCallback.f(short, short, byte, java.lang.Object[]):void");
    }

    public tryUnregisterOnBackInvokedCallback() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = calendar;
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar2, "");
        this.g = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar3, "");
        this.d = calendar3;
        Calendar calendar4 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar4, "");
        this.asBinder = calendar4;
        this.a = R.layout.fragment_indonesian_migrant_worker_filling_form_register;
    }

    /* JADX INFO: renamed from: tryUnregisterOnBackInvokedCallback$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LtryUnregisterOnBackInvokedCallback$b;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "p0", "LtryUnregisterOnBackInvokedCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)LtryUnregisterOnBackInvokedCallback;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static tryUnregisterOnBackInvokedCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(MigrantWorkerRegistration p0) {
            tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback = new tryUnregisterOnBackInvokedCallback();
            Bundle bundle = new Bundle();
            bundle.putParcelable("migration_worker_data", p0);
            tryunregisteronbackinvokedcallback.setArguments(bundle);
            return tryunregisteronbackinvokedcallback;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(notify ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 71;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 3;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(notify)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64838), 1355 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf("", "") + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 469, 13 - TextUtils.getOffsetAfter("", 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentIndonesianMigrantWorkerFillingFormRegisterBinding> d() {
        int i = 2 % 2;
        int i2 = cancel + 77;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerFillingFormRegisterFragment$bindingInflater$1 indonesianMigrantWorkerFillingFormRegisterFragment$bindingInflater$1 = IndonesianMigrantWorkerFillingFormRegisterFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = cancelAll + 93;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return indonesianMigrantWorkerFillingFormRegisterFragment$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getAsInterface() {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 47;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.a;
        int i6 = i2 + 1;
        cancelAll = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        final FragmentIndonesianMigrantWorkerFillingFormRegisterBinding fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ToolbarOnMenuItemClickListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tryUnregisterOnBackInvokedCallback.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilIssuedPassportDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: copyMarginsFromCompat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tryUnregisterOnBackInvokedCallback.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
            int i2 = cancelAll + 101;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        }
        EditText editText2 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPublishedVisaDate.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: ToolbarSavedState
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view};
                    int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentbindingInflater1(CaptureBundle.TuitionPaymentFragmentbindingInflater1(), CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, objArr, 648805855, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), -648805855);
                }
            });
        }
        EditText editText3 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilStartDateAgreement.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: detectDisplayOptions
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            int i4 = cancel + 117;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        }
        EditText editText4 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEndDateAgreement.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() { // from class: updateHomeAccessibility
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        EditText editText5 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseWorkingCountry.getEditText();
        if (editText5 != null) {
            editText5.setOnClickListener(new View.OnClickListener() { // from class: ToolbarSavedState1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
            int i6 = cancelAll + 115;
            cancel = i6 % 128;
            int i7 = i6 % 2;
        }
        EditText editText6 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseJobType.getEditText();
        if (editText6 != null) {
            editText6.setOnClickListener(new View.OnClickListener() { // from class: ensureSpinner
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, view};
                    int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentbindingInflater1(CaptureBundle.TuitionPaymentFragmentbindingInflater1(), CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, objArr, -1156038791, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), 1156038793);
                }
            });
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        FragmentIndonesianMigrantWorkerFillingFormRegisterBinding fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseWorkingCountry;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPassportNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilIssuedPassportDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilVisaNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout5 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPublishedVisaDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout6 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseJobType;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        TextInputLayout textInputLayout7 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilAgreementNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout7, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
        TextInputLayout textInputLayout8 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilStartDateAgreement;
        Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
        String string8 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout8, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string8))));
        TextInputLayout textInputLayout9 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEndDateAgreement;
        Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
        String string9 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout9, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string9))));
        TextInputEditText textInputEditText = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.edtPhoneNumberEmployee;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string10 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        String string11 = getString(R.string.error_phone_number_length);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string10), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string11, 9, 12)})));
        TextInputLayout textInputLayout10 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
        String string12 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string12, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string12);
        String string13 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string13, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout10, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string13)})));
        TextInputLayout textInputLayout11 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmailConfirmation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
        String string14 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string14, "");
        String string15 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string15, "");
        String string16 = getString(R.string.error_unmatch_email);
        Intrinsics.checkNotNullExpressionValue(string16, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout11, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string14), new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string15), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: updateToolbarLogo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(tryUnregisterOnBackInvokedCallback.b(this.b));
            }
        }, string16)})));
        TextInputLayout textInputLayout12 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerIdentityNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
        String string17 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string17, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout12, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string17))));
        TextInputLayout textInputLayout13 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout13, "");
        String string18 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string18, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout13, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string18))));
        TextInputLayout textInputLayout14 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEChooseEmployerCity;
        Intrinsics.checkNotNullExpressionValue(textInputLayout14, "");
        String string19 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string19, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout14, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string19))));
        TextInputLayout textInputLayout15 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout15, "");
        String string20 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string20, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout15, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string20))));
        TextInputEditText textInputEditText2 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.edtEmployerPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        String string21 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string21, "");
        String string22 = getString(R.string.error_phone_number_length);
        Intrinsics.checkNotNullExpressionValue(string22, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputEditText2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string21), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string22, 9, 12)})));
        int i2 = cancel + 45;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        String str;
        int i = 2 % 2;
        int i2 = cancelAll + 35;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ((ArrayAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).addAll(CollectionsKt.mutableListOf("+62"));
        EditText editText = INotificationSideChannelStub().tilChooseWorkingCountry.getEditText();
        if (editText != null) {
            MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (migrantWorkerRegistration != null) {
                str = migrantWorkerRegistration.notify;
                int i4 = cancel + 107;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = null;
            }
            editText.setText(str);
        }
        MigrantWorkerRegistration migrantWorkerRegistration2 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String str2 = migrantWorkerRegistration2 != null ? migrantWorkerRegistration2.cancel : null;
        if (str2 == null) {
            int i6 = cancelAll + 71;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            str2 = "";
        }
        MigrantWorkerRegistration migrantWorkerRegistration3 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String str3 = migrantWorkerRegistration3 != null ? migrantWorkerRegistration3.notify : null;
        this.b = new CodeNamePair(str2, str3 != null ? str3 : "");
        INotificationSideChannelStub().actvSpinnerCountryCode.setAdapter((ArrayAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String str;
        int i = 2 % 2;
        FragmentIndonesianMigrantWorkerFillingFormRegisterBinding fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPassportNumber.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilVisaNumber.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText3 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilAgreementNumber.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText4 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerIdentityNumber.getEditText();
        if (editText4 != null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault3(editText4);
        }
        EditText editText5 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerName.getEditText();
        if (editText5 != null) {
            Intrinsics.checkNotNullParameter(editText5, "");
            editText5.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
            int i2 = cancel + 111;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
        }
        EditText editText6 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerAddress.getEditText();
        if (editText6 != null) {
            Intrinsics.checkNotNullParameter(editText6, "");
            editText6.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText7 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEChooseEmployerCity.getEditText();
        if (editText7 != null) {
            Intrinsics.checkNotNullParameter(editText7, "");
            editText7.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText8 = INotificationSideChannelStub().tilPassportNumber.getEditText();
        if (editText8 != null) {
            MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (migrantWorkerRegistration != null) {
                int i4 = cancelAll + 19;
                cancel = i4 % 128;
                if (i4 % 2 != 0) {
                    str = migrantWorkerRegistration.g;
                    int i5 = 78 / 0;
                } else {
                    str = migrantWorkerRegistration.g;
                }
            } else {
                str = null;
            }
            editText8.setText(str);
        }
        INotificationSideChannelStub().rbFormal.setChecked(true);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = cancel + 33;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = cancel + 87;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancel + 57;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = cancel + 107;
        cancelAll = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 75;
        cancelAll = i2 % 128;
        Editable text = null;
        if (i2 % 2 == 0) {
            INotificationSideChannelStub().tilEmail.getEditText();
            text.hashCode();
            throw null;
        }
        EditText editText = INotificationSideChannelStub().tilEmail.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = INotificationSideChannelStub().tilEmailConfirmation.getEditText();
        if (editText2 != null) {
            int i3 = cancel + 117;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0) {
                editText2.getText();
                text.hashCode();
                throw null;
            }
            text = editText2.getText();
        }
        return Intrinsics.areEqual(String.valueOf(text), strValueOf);
    }

    public static /* synthetic */ boolean b(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback) {
        int i = 2 % 2;
        int i2 = cancelAll + 117;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        boolean zTuitionPaymentFragmentbindingInflater1 = tryunregisteronbackinvokedcallback.TuitionPaymentFragmentbindingInflater1();
        int i4 = cancelAll + 29;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return zTuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: ToolbarWidgetWrapper
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, i3, i4);
                }
            }, tryunregisteronbackinvokedcallback.d.get(1), tryunregisteronbackinvokedcallback.d.get(2), tryunregisteronbackinvokedcallback.d.get(5)).show();
            ViewPortBuilder.b();
            int i2 = cancelAll + 51;
            cancel = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, int i, int i2, int i3) {
        int i4 = 2 % 2;
        tryunregisteronbackinvokedcallback.d.set(1, i);
        tryunregisteronbackinvokedcallback.d.set(2, i2);
        tryunregisteronbackinvokedcallback.d.set(5, i3);
        tryunregisteronbackinvokedcallback.INotificationSideChannelStub().edtStartDateAgreement.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(tryunregisteronbackinvokedcallback.d.getTime()));
        int i5 = cancel + 45;
        cancelAll = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, int i, int i2, int i3) {
        int i4 = 2 % 2;
        tryunregisteronbackinvokedcallback.g.set(1, i);
        tryunregisteronbackinvokedcallback.g.set(2, i2);
        tryunregisteronbackinvokedcallback.g.set(5, i3);
        tryunregisteronbackinvokedcallback.INotificationSideChannelStub().edtPublishedVisaDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(tryunregisteronbackinvokedcallback.g.getTime()));
        int i5 = cancelAll + 105;
        cancel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback = (tryUnregisterOnBackInvokedCallback) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 19;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = tryunregisteronbackinvokedcallback.getArguments();
        if (arguments == null) {
            return null;
        }
        int i4 = cancelAll + 85;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return (MigrantWorkerRegistration) arguments.getParcelable("migration_worker_data");
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            setTitleTextColor.Companion companion = setTitleTextColor.INSTANCE;
            setTitleTextColor settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setTitleTextColor.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tryunregisteronbackinvokedcallback.b, new Function1() { // from class: ToolbarApi33ImplExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = tryunregisteronbackinvokedcallback.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = cancelAll + 77;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i4 = cancelAll + 117;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: TooltipCompat
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) throws Throwable {
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i2, i3, i4);
                }
            }, tryunregisteronbackinvokedcallback.asBinder.get(1), tryunregisteronbackinvokedcallback.asBinder.get(2), tryunregisteronbackinvokedcallback.asBinder.get(5)).show();
            ViewPortBuilder.b();
            int i2 = cancelAll + 65;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        tryunregisteronbackinvokedcallback.b = codeNamePair;
        EditText editText = tryunregisteronbackinvokedcallback.INotificationSideChannelStub().tilChooseWorkingCountry.getEditText();
        if (editText != null) {
            int i2 = cancelAll + 69;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i4 = cancel + 21;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        }
        tryunregisteronbackinvokedcallback.INotificationSideChannelStub().tilChooseWorkingCountry.setError(null);
        tryunregisteronbackinvokedcallback.INotificationSideChannelStub().tilChooseWorkingCountry.setErrorEnabled(false);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback = (tryUnregisterOnBackInvokedCallback) objArr[0];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[1]);
        try {
            saveBitmap.Companion companion = saveBitmap.INSTANCE;
            saveBitmap savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: setTitleInt
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (Job) obj);
                }
            });
            FragmentManager childFragmentManager = tryunregisteronbackinvokedcallback.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            Object obj = null;
            if (childFragmentManager.findFragmentByTag(savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = cancelAll + 7;
                cancel = i2 % 128;
                if (i2 % 2 != 0) {
                    savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    obj.hashCode();
                    throw null;
                }
                savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i3 = cancel + 33;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, Job job) {
        int i = 2 % 2;
        int i2 = cancelAll + 91;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(job, "");
        tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = job;
        EditText editText = tryunregisteronbackinvokedcallback.INotificationSideChannelStub().tilChooseJobType.getEditText();
        if (editText != null) {
            int i4 = cancelAll + 99;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw null;
            }
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i5 = cancelAll + 3;
            cancel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback = (tryUnregisterOnBackInvokedCallback) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: ToolbarWidgetWrapper2
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    tryUnregisterOnBackInvokedCallback.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, i2, i3, i4);
                }
            }, tryunregisteronbackinvokedcallback.g.get(1), tryunregisteronbackinvokedcallback.g.get(2), tryunregisteronbackinvokedcallback.g.get(5)).show();
            ViewPortBuilder.b();
            int i2 = cancel + 17;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, FragmentIndonesianMigrantWorkerFillingFormRegisterBinding fragmentIndonesianMigrantWorkerFillingFormRegisterBinding, View view) {
        Editable text;
        String str;
        Editable text2;
        Editable text3;
        int i = 2 % 2;
        int i2 = cancel + 23;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            tryunregisteronbackinvokedcallback.TuitionPaymentFragmentbindingInflater1();
            throw null;
        }
        if (tryunregisteronbackinvokedcallback.TuitionPaymentFragmentbindingInflater1()) {
            FragmentIndonesianMigrantWorkerFillingFormRegisterBinding fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub = tryunregisteronbackinvokedcallback.INotificationSideChannelStub();
            MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) tryunregisteronbackinvokedcallback.TuitionPaymentFragmentbindingInflater1.getValue();
            if (migrantWorkerRegistration != null) {
                int i4 = cancelAll + 63;
                cancel = i4 % 128;
                if (i4 % 2 != 0) {
                    fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseWorkingCountry.getEditText();
                    throw null;
                }
                EditText editText = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseWorkingCountry.getEditText();
                if (editText != null) {
                    int i5 = cancelAll + 41;
                    cancel = i5 % 128;
                    int i6 = i5 % 2;
                    text = editText.getText();
                } else {
                    text = null;
                }
                String string = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                EditText editText2 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPassportNumber.getEditText();
                String string2 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                EditText editText3 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilIssuedPassportDate.getEditText();
                String string3 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                EditText editText4 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilVisaNumber.getEditText();
                String string4 = StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString();
                EditText editText5 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPublishedVisaDate.getEditText();
                String string5 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString();
                if (fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.rgJobStatus.getCheckedRadioButtonId() == fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.rbFormal.getId()) {
                    int i7 = cancelAll + 103;
                    cancel = i7 % 128;
                    int i8 = i7 % 2;
                    str = "FORMAL";
                } else {
                    str = "INFORMAL";
                }
                String str2 = str;
                Job job = tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str3 = job != null ? job.TuitionPaymentFragmentbindingInflater1 : null;
                EditText editText6 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilChooseJobType.getEditText();
                String string6 = StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString();
                EditText editText7 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilAgreementNumber.getEditText();
                if (editText7 != null) {
                    int i9 = cancel + 55;
                    cancelAll = i9 % 128;
                    if (i9 % 2 == 0) {
                        editText7.getText();
                        migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1.hashCode();
                        throw null;
                    }
                    text2 = editText7.getText();
                } else {
                    text2 = null;
                }
                String string7 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                EditText editText8 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilStartDateAgreement.getEditText();
                String string8 = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
                EditText editText9 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEndDateAgreement.getEditText();
                String string9 = StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString();
                EditText editText10 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilPhoneNumberEmployee.getEditText();
                String string10 = StringsKt.trim((CharSequence) String.valueOf(editText10 != null ? editText10.getText() : null)).toString();
                EditText editText11 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmail.getEditText();
                String string11 = StringsKt.trim((CharSequence) String.valueOf(editText11 != null ? editText11.getText() : null)).toString();
                EditText editText12 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerIdentityNumber.getEditText();
                if (editText12 != null) {
                    int i10 = cancel + 33;
                    cancelAll = i10 % 128;
                    int i11 = i10 % 2;
                    text3 = editText12.getText();
                } else {
                    text3 = null;
                }
                String string12 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                EditText editText13 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerName.getEditText();
                String string13 = StringsKt.trim((CharSequence) String.valueOf(editText13 != null ? editText13.getText() : null)).toString();
                EditText editText14 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEChooseEmployerCity.getEditText();
                String string14 = StringsKt.trim((CharSequence) String.valueOf(editText14 != null ? editText14.getText() : null)).toString();
                EditText editText15 = fragmentIndonesianMigrantWorkerFillingFormRegisterBindingINotificationSideChannelStub.tilEmployerPhoneNumber.getEditText();
                migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = MigrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1(migrantWorkerRegistration, null, null, null, null, null, null, null, null, string2, string3, null, null, null, null, string, str2, str3, string6, string12, string13, string14, StringsKt.trim((CharSequence) String.valueOf(editText15 != null ? editText15.getText() : null)).toString(), string4, string5, string7, string8, string9, null, string11, string10, null, null, null, null, null, null, -939508481, 15);
            }
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = new Camera2CameraControlExternalSyntheticLambda1(migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
            Intrinsics.checkNotNullParameter(camera2CameraControlExternalSyntheticLambda1, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(camera2CameraControlExternalSyntheticLambda1);
        } else {
            EditText editText16 = fragmentIndonesianMigrantWorkerFillingFormRegisterBinding.tilEmailConfirmation.getEditText();
            if (editText16 != null) {
                editText16.setError(tryunregisteronbackinvokedcallback.getString(R.string.error_unmatch_password));
                editText16.requestFocus();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0249  */
    /* JADX WARN: Code duplicated, block: B:27:0x024e  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, int i, int i2, int i3) throws Throwable {
        Object[] objArr;
        int i4 = 2 % 2;
        tryunregisteronbackinvokedcallback.asBinder.set(1, i);
        tryunregisteronbackinvokedcallback.asBinder.set(2, i2);
        tryunregisteronbackinvokedcallback.asBinder.set(5, i3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
            int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 920;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
            byte[] bArr = $$a;
            byte b = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b, bArr[7], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, i5, scrollBarFadeDuration, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{33535, 33438, 45242, 57261, 20336, 152, 37350, 20097, 16244, 62105, 54210, 3321, 63832, 13471, 5604, 51960, 47914, 30459, 22426, 35050, 29954, 47335, 39326, 17676, 14312, 64299}, -Process.getGidForName(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{52787, 52822, 4708, 32113, 60103, 51770, 13396, 33825, 29604, 20553, 30325, 50727, 46494, 38481, 45073, '}', 63478, 54329, 62012}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int i6 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (b3 & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, pressedStateDuration, i6, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = cancelAll + 97;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[37], (byte) (-bArr3[1]), (byte) ($$b & 231), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration2, deadChar, defaultSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i9 = (-1221121763) + (((~((-642963283) | startElapsedRealtime)) | 605061138 | (~(1131116361 | startElapsedRealtime))) * (-754));
            int i10 = ~((-605061139) | startElapsedRealtime);
            int i11 = ~startElapsedRealtime;
            int i12 = i9 + ((i10 | (~(1736177499 | i11))) * (-754)) + ((i11 | (-642963283)) * 754) + 1790399732;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{59433, 59464, 46346, 55837, 56507, 60170, 557, 42259, 21922, 63273, 16393, 59243, 37760, 12588, 34417, 8471, 53700, 29531, 50257, 25460, 8143, 48509, 2637, 44680, 23817, 65176, 18607, 59568, 39696, 14504}, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{64967, 64932, 47134, 55058, 1795, 4770, 55683, 23739, 16454, 64033, 39841, 7852, 34431, 15395, 24021, 55544, 50184, 32342, 8169, 39644, 2616, 45173}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i15 = cancelAll + 15;
                    cancel = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 88 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{62458, 62352, 43700, 50604, 23558, 48005, 33410, 62863, 20016, 59549, 49329, 47012, 34901, 11971, 1775, 29135, 51749, 27901, 17661, 13311}, 1 - Color.blue(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{60821, 60924, 37488, 64877, 5313, 48061, 51798, 62904, 20485, 53337, 34915, 46987, 38421, 5709, 19976, 29158, 54394, 21543, 3131, 13263}, 1 - TextUtils.getOffsetBefore("", 0), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, tryunregisteronbackinvokedcallback)).intValue()), 0, 1790399732};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[26];
                Object[] objArr13 = new Object[1];
                f(b4, b4, bArr4[57], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr4[57];
                Object[] objArr14 = new Object[1];
                f(b5, b5, bArr4[26], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                    int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    c(bArr5[37], (byte) (-bArr5[1]), (byte) ($$b & 231), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, threadPriority, pressedStateDuration3, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{33535, 33438, 45242, 57261, 20336, 152, 37350, 20097, 16244, 62105, 54210, 3321, 63832, 13471, 5604, 51960, 47914, 30459, 22426, 35050, 29954, 47335, 39326, 17676, 14312, 64299}, 1 - KeyEvent.keyCodeFromString(""), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{52787, 52822, 4708, 32113, 60103, 51770, 13396, 33825, 29604, 20553, 30325, 50727, 46494, 38481, 45073, '}', 63478, 54329, 62012}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                        byte[] bArr6 = $$a;
                        byte b6 = bArr6[37];
                        byte b7 = bArr6[7];
                        Object[] objArr18 = new Object[1];
                        c(b6, b7, (byte) (b7 & 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, iLastIndexOf, offsetAfter, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                        int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr7 = $$a;
                        byte b8 = bArr7[80];
                        Object[] objArr19 = new Object[1];
                        c(b8, bArr7[7], b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, tapTimeout, doubleTapTimeout, -1048449946, false, (String) objArr19[0], null);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i20 = (int) Runtime.getRuntime().totalMemory();
            int i21 = i19 + 782961999 + (((~(i20 | 805741683)) | 968337960) * 191) + (((~((~i20) | 805741683)) | 162597384) * 191);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i24 = cancel + 93;
                cancelAll = i24 % 128;
                int i25 = i24 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            new int[1][0] = i27;
            new int[1][0] = i28;
            int i29 = i26 + (-1650030547) + (((~((~i) | (-286270466))) | (~(1065205375 | i))) * (-302)) + ((~((-286270466) | i)) * (-604)) + (((~(i | 778934910)) | 70060642) * 302);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            int[] iArr = {i31 ^ (i31 << 5)};
        }
        tryunregisteronbackinvokedcallback.INotificationSideChannelStub().edtEndDateAgreement.setText(simpleDateFormat.format(tryunregisteronbackinvokedcallback.asBinder.getTime()));
    }

    public static /* synthetic */ void d(final tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: ToolbarLayoutParams
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    tryUnregisterOnBackInvokedCallback.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, i3, i4);
                }
            }, tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(1), tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(2), tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(5)).show();
            ViewPortBuilder.b();
            int i2 = cancel + 17;
            cancelAll = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, int i, int i2, int i3) {
        int i4 = 2 % 2;
        tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(1, i);
        tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(2, i2);
        tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(5, i3);
        tryunregisteronbackinvokedcallback.INotificationSideChannelStub().edtPublishedPassportDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(tryunregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getTime()));
        int i5 = cancelAll + 37;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback) {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        return (MigrantWorkerRegistration) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater2, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tryunregisteronbackinvokedcallback}, 190611718, iTuitionPaymentFragmentbindingInflater3, -190611717);
    }

    public static /* synthetic */ ArrayAdapter TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback) {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        return (ArrayAdapter) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater2, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tryunregisteronbackinvokedcallback}, -539351823, iTuitionPaymentFragmentbindingInflater3, 539351827);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater2, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tryunregisteronbackinvokedcallback, view}, -1156038791, iTuitionPaymentFragmentbindingInflater3, 1156038793);
    }

    public static /* synthetic */ void b(tryUnregisterOnBackInvokedCallback tryunregisteronbackinvokedcallback, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater2, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tryunregisteronbackinvokedcallback, view}, 648805855, iTuitionPaymentFragmentbindingInflater3, -648805855);
    }

    static {
        INotificationSideChannel = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStubProxy + 79;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = cancel + 1;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater2, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{this}, -884291363, iTuitionPaymentFragmentbindingInflater3, 884291366);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        notify = -8829081939818478305L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 61;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 107
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = defpackage.tryUnregisterOnBackInvokedCallback.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tryUnregisterOnBackInvokedCallback.$$g(byte, int, short):java.lang.String");
    }
}
