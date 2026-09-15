package com.bpjstku.presentation.membership.devicebinding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.OtherPreferences;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityTermsAndConditionDeviceLinkingBinding;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.mapPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0015\u0010\u0006\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0015\u0010\f\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0017\u0010\n\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0017\u0010\b\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/TermsAndConditionDeviceLinkingActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTermsAndConditionDeviceLinkingBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/data/lib/PreferenceManager;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/data/lib/OtherPreferences;", "", "d", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsAndConditionDeviceLinkingActivity extends BindingBaseActivity<ActivityTermsAndConditionDeviceLinkingBinding> {
    private static char INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f517a;
    private static int cancel;
    private static long d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {110, -73, -111, 99};
    private static final int $$f = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, -79, 42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 23;
    private static int onTransact = 0;
    private static int cancelAll = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: isAutoSizeEnabled
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: getCompoundDrawableTintList
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: onAsyncTypefaceReceived
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsAndConditionDeviceLinkingActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: setCompoundDrawableTintList
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: onSetTextAppearance
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i4) | i7);
        int i9 = (~i2) | (~(i7 | i4));
        int i10 = i4 | i2 | i7;
        int i11 = i2 + i + i6 + (1635157569 * i3) + ((-1141649966) * i5);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i2) - 711983104) + (488484398 * i) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i3) + (1566572544 * i5) + (1631846400 * i12);
        int i14 = (i2 * 1521345644) + 2088555610 + (i * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i3 * (-1382509809)) + (i5 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        int i16 = 2 % 2;
        int i17 = notify + 109;
        cancelAll = i17 % 128;
        int i18 = i17 % 2;
        return null;
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
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 3
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.c(short, int, short, java.lang.Object[]):void");
    }

    public TermsAndConditionDeviceLinkingActivity() {
        final TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = termsAndConditionDeviceLinkingActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<OtherPreferences>() { // from class: com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.OtherPreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final OtherPreferences invoke() {
                ComponentCallbacks componentCallbacks = termsAndConditionDeviceLinkingActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(OtherPreferences.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/TermsAndConditionDeviceLinkingActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) TermsAndConditionDeviceLinkingActivity.class);
            intent.putExtra("email", p1);
            intent.putExtra("key_title_message", p2);
            intent.putExtra("key_message", p3);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTermsAndConditionDeviceLinkingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 97;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        TermsAndConditionDeviceLinkingActivity$bindingInflater$1 termsAndConditionDeviceLinkingActivity$bindingInflater$1 = TermsAndConditionDeviceLinkingActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = cancelAll + 25;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return termsAndConditionDeviceLinkingActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityTermsAndConditionDeviceLinkingBinding activityTermsAndConditionDeviceLinkingBinding = (ActivityTermsAndConditionDeviceLinkingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        MaterialButton materialButton = activityTermsAndConditionDeviceLinkingBinding.btnConfirm;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onSetCompoundDrawables
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1(-426869447, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj}, 426869449, CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        }));
        MaterialButton materialButton2 = activityTermsAndConditionDeviceLinkingBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: populateSurroundingTextIfNeeded
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        int i2 = cancelAll + 77;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 9;
        notify = i2 % 128;
        int i3 = i2 % 2;
        if (((String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).length() > 0) {
            int i4 = notify + 21;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                ((OtherPreferences) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("KEY_EMAIL", (String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
            } else {
                ((OtherPreferences) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("KEY_EMAIL", (String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
                int i5 = 61 / 0;
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancelAll + 21;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity = this;
            Intrinsics.checkNotNullParameter(termsAndConditionDeviceLinkingActivity, "");
            termsAndConditionDeviceLinkingActivity.getWindow().addFlags(28979);
        } else {
            TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity2 = this;
            Intrinsics.checkNotNullParameter(termsAndConditionDeviceLinkingActivity2, "");
            termsAndConditionDeviceLinkingActivity2.getWindow().addFlags(8192);
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
            int i4 = $10 + 45;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) (8328 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int threadPriority = 1235 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int edgeSlop = 35 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b = (byte) ($$f & 6);
                    byte b2 = (byte) (b - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, threadPriority, edgeSlop, -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2765, 14 - TextUtils.getTrimmedLength(""), 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myPid() >> 22) + 43325), Color.red(0) + 253, 22 - (ViewConfiguration.getTapTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 65200);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2891;
                    int scrollBarSize2 = 17 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b5 = (byte) ($$f & 5);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, scrollBarSize, scrollBarSize2, 2012627446, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (d ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) f517a) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) INotificationSideChannel) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 63;
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
            int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
            short s = $$a[6];
            byte b = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, offsetAfter, modifierMetaStateMask, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                int gidForName = Process.getGidForName("") + 1756;
                int i2 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b2 = $$a[6];
                Object[] objArr3 = new Object[1];
                c((short) 37, b2, b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, gidForName, i2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (((855562996 + ((~((-135529479) | iIdentityHashCode)) * (-301))) + (((~(705963423 | iIdentityHashCode)) | (~((~iIdentityHashCode) | 918565849))) * (-301))) + (((~(iIdentityHashCode | (-918565850))) | 705963423) * 301)) - 826000898;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{18704, 36810, 18422, 18776}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step3).substring(3, 4).length() + 22598), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{64086, 35077, 49513, 8341, 35753, 29875, 5684, 37404, 16177, 31012, 39451, 12417, 12413, 12891, 55496, 4405}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{55536, 43359, 10099, 2664}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26627), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{37300, 6851, 59510, 28423, 44400, 13612, 30435, 11145, 44989, 54422, 60593, 50904, 6421, 38061, 63266, 29866}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {88428056};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -826000898, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i6 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b3 = $$a[6];
                    Object[] objArr8 = new Object[1];
                    c((short) 37, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, maximumFlingVelocity, i6, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{20699, 4149, 4363, 42231}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_4).substring(5, 12).codePointAt(2) - 110), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{608, 28640, 33608, 28893, 9282, 24424, 10672, 57034, 9687, '_', 10015, 50457, 25081, 14222, 57793, 25934, 17264, 1216, 1954, 34303, 24437, 42756}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{57553, 30654, 37514, 57636}, (char) (View.MeasureSpec.getMode(0) + 9362), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1971863876, new char[]{37941, 38633, 54215, 19222, 30728, 5498, 34820, 53861, 32581, 36419, 40323, 51064, 58767, 10803, 47373}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity2 = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                        int defaultSize = View.getDefaultSize(0, 0) + 23;
                        byte b4 = $$a[6];
                        Object[] objArr11 = new Object[1];
                        c((short) 89, b4, b4, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity2, windowTouchSlop, defaultSize, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                        int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                        short s2 = $$a[6];
                        byte b5 = (byte) s2;
                        Object[] objArr12 = new Object[1];
                        c(s2, b5, (byte) (b5 | 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionChild, packedPositionType, 986134021, false, (String) objArr12[0], null);
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
        int i7 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i8 != i7) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i8));
        }
        int i9 = notify + 59;
        cancelAll = i9 % 128;
        int i10 = i9 % 2;
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i12 = ~iUptimeMillis;
        int i13 = i11 + (-144688828) + (((~((-971311539) | i12)) | (~(758709112 | i12))) * (-867)) + (((~((-971311539) | iUptimeMillis)) | 281346178 | (~(758709112 | iUptimeMillis))) * (-1734)) + (((~(iUptimeMillis | 1040055290)) | (~(i12 | (-281346179))) | (~((-689965361) | iUptimeMillis))) * 867);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        int i16 = notify + 9;
        cancelAll = i16 % 128;
        int i17 = i16 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int gidForName2 = 1030 - Process.getGidForName("");
            int iGreen = 15 - Color.green(0);
            byte b6 = $$a[6];
            Object[] objArr14 = new Object[1];
            c((short) 141, b6, b6, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, gidForName2, iGreen, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{20699, 4149, 4363, 42231}, (char) View.MeasureSpec.getMode(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{608, 28640, 33608, 28893, 9282, 24424, 10672, 57034, 9687, '_', 10015, 50457, 25081, 14222, 57793, 25934, 17264, 1216, 1954, 34303, 24437, 42756}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{57553, 30654, 37514, 57636}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 9326), (-1971863851) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_cimb_clicks).substring(0, 11).length(), new char[]{37941, 38633, 54215, 19222, 30728, 5498, 34820, 53861, 32581, 36419, 40323, 51064, 58767, 10803, 47373}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i18 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i19 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
            byte b7 = $$a[6];
            Object[] objArr17 = new Object[1];
            c((short) 37, b7, b7, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout2, i18, i19, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i20 = notify + 43;
            cancelAll = i20 % 128;
            int i21 = i20 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 16;
                Object[] objArr18 = new Object[1];
                c((short) 193, $$a[27], (byte) 52, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, minimumFlingVelocity, iIndexOf, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr19[3])[0];
            int i23 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i25 = (((-974866977) + (((-271019373) | (~i24)) * (-490))) + (((~(i24 | 735609346)) | (-1006628719)) * 490)) - 1644869280;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{18704, 36810, 18422, 18776}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_hat_text).substring(0, 4).length() + 22595), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step3).substring(3, 4).length() - 1, new char[]{64086, 35077, 49513, 8341, 35753, 29875, 5684, 37404, 16177, 31012, 39451, 12417, 12413, 12891, 55496, 4405}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{55536, 43359, 10099, 2664}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26627), Color.green(0), new char[]{37300, 6851, 59510, 28423, 44400, 13612, 30435, 11145, 44989, 54422, 60593, 50904, 6421, 38061, 63266, 29866}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {88428056};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1134 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1759624194, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cRed = (char) Color.red(0);
                int windowTouchSlop2 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b8 = $$a[6];
                Object[] objArr24 = new Object[1];
                c((short) 141, b8, b8, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed, windowTouchSlop2, edgeSlop, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Gravity.getAbsoluteGravity(0, 0) + 45993), TextUtils.lastIndexOf("", '0') + 1118, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                Object[] objArr25 = new Object[1];
                c((short) 193, $$a[27], (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(minimumFlingVelocity2, iLastIndexOf, iMakeMeasureSpec, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{20699, 4149, 4363, 42231}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, new char[]{608, 28640, 33608, 28893, 9282, 24424, 10672, 57034, 9687, '_', 10015, 50457, 25081, 14222, 57793, 25934, 17264, 1216, 1954, 34303, 24437, 42756}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{57553, 30654, 37514, 57636}, (char) (9362 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-1971863844) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length(), new char[]{37941, 38633, 54215, 19222, 30728, 5498, 34820, 53861, 32581, 36419, 40323, 51064, 58767, 10803, 47373}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                    byte b9 = $$a[6];
                    Object[] objArr28 = new Object[1];
                    c((short) 37, b9, b9, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, capsMode, scrollBarFadeDuration, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int tapTimeout3 = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int threadPriority2 = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b10 = $$a[6];
                    Object[] objArr29 = new Object[1];
                    c((short) 141, b10, b10, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, tapTimeout3, threadPriority2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i28 = ((int[]) objArr[1])[0];
        int i29 = ((int[]) objArr[3])[0];
        if (i29 == i28) {
            int i30 = notify + 69;
            cancelAll = i30 % 128;
            int i31 = i30 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr[2])[0];
            int i33 = ((int[]) objArr[3])[0];
            int i34 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i35 = i32 + (((~(iIdentityHashCode2 | 354466290)) | (-110186121)) * 56) + 1332255409 + (((~((~iIdentityHashCode2) | (-110186121))) | 354466290) * 56);
            int i36 = i35 ^ (i35 << 13);
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr30[2])[0] = i37 ^ (i37 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i38 = notify + 55;
            cancelAll = i38 % 128;
            int i39 = i38 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i29];
        int i40 = i29 - 1;
        iArr[i40] = 1;
        Toast.makeText((Context) null, iArr[((i29 * i40) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i45 = ~i44;
        int i46 = i41 + (-1641961299) + ((335542271 | i44) * (-676)) + (((~(311349993 | i45)) | (-335542272)) * 676) + (((~(i44 | (-24192279))) | (~(i45 | 67069823)) | 268472448) * 676);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[2])[0] = i48 ^ (i48 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:12:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0098  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i;
        int i2 = 2 % 2;
        int i3 = notify + 71;
        cancelAll = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            if (i4 != (-1273806040) + ((24510482 | i5) * (-192)) + (((~(1400292658 | i5)) | 545794633) * (-384)) + (((~(iIdentityHashCode | (-1375782177))) | (~(i5 | 1946087291)) | (~((-545794634) | iIdentityHashCode))) * DerHeader.TAG_CLASS_PRIVATE)) {
                i = cancelAll + 21;
                notify = i % 128;
                if (i % 2 == 0) {
                    int[] iArr = new int[211698674];
                    iArr[211698673] = 0;
                    int i6 = (-1809691438) / 2;
                    Toast.makeText((Context) null, iArr[-1], 1).show();
                } else {
                    int[] iArr2 = new int[211698674];
                    iArr2[211698673] = 1;
                    int i7 = (-1809691438) % 2;
                    Toast.makeText((Context) null, iArr2[-1], 1).show();
                }
            }
        } else {
            int i8 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i9 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            if (i8 != (-1791415036) + (((~((-645573483) | i9)) | 1475561025) * (-933)) + (((~(i9 | 1475561025)) | (-2012999532)) * 933) + 203216805) {
                i = cancelAll + 21;
                notify = i % 128;
                if (i % 2 == 0) {
                    int[] iArr3 = new int[211698674];
                    iArr3[211698673] = 0;
                    int i10 = (-1809691438) / 2;
                    Toast.makeText((Context) null, iArr3[-1], 1).show();
                } else {
                    int[] iArr4 = new int[211698674];
                    iArr4[211698673] = 1;
                    int i11 = (-1809691438) % 2;
                    Toast.makeText((Context) null, iArr4[-1], 1).show();
                }
            }
        }
        int i12 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i13 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i14 = ~((-168397409) | i13);
        int i15 = ~i13;
        if (i12 != 669516476 + ((i14 | (~(i15 | 2147483515))) * 920) + (((~((-263174777) | i15)) | 168397408) * 920) + (((~(i13 | 2147483515)) | (~((-168397409) | i15)) | (~((-94777369) | i13))) * 920)) {
            int[] iArr5 = new int[1380589905];
            iArr5[1380589904] = 1;
            int i16 = (-656418224) % 2;
            Toast.makeText((Context) null, iArr5[-1], 1).show();
            int i17 = notify + 83;
            cancelAll = i17 % 128;
            int i18 = i17 % 2;
        }
        super.onResume();
        int i19 = notify + 115;
        cancelAll = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 97;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-356471316) + (((~(iIdentityHashCode | 141312369)) | 971299912) * (-668)) + ((141312369 | (~(971299912 | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | 971824505) * 668)) {
            int i5 = 1335134858 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1713146974;
        int i8 = ~i7;
        if (i6 != 246078256 + (((~((-215678937) | i8)) | 1931590267) * (-865)) + ((~(i7 | 215678936)) * 865) + (((~(1931590267 | i8)) | (~(i8 | 215678936))) * 865)) {
            throw new RuntimeException("-1297418066");
        }
        super.onStart();
        int i9 = cancelAll + 5;
        notify = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b1, code lost:
    
        if (r0 != ((((-238692436) + ((~((~r3) | (-1715930276))) * (-116))) + ((414763540 | r3) * 116)) + (((~(r3 | 2130674871)) | 18944) * 116))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b3, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.cancelAll + 41;
        com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.notify = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
    
        if ((r9 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
    
        throw new java.lang.RuntimeException("-1929164352");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
    
        if (r3 == (r8 + (((~(r5 | 2130313215)) | (r6 | (~((-134235153) | r5)))) * 140))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0083, code lost:
    
        if (r3 == ((((-1134047304) + (((~r5) | 277317185) * 1324)) + (((~(r5 | (-1863334301))) | (~(1033346757 | r5))) * (-1324))) - 1791673020)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = android.os.Process.myUid();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r9) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 39;
        notify = i2 % 128;
        String string$default = i2 % 2 == 0 ? PreferenceManager.getString$default((PreferenceManager) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue(), "DEVICE_LINK_TRANSACTION_ID", null, 4, null) : PreferenceManager.getString$default((PreferenceManager) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue(), "DEVICE_LINK_TRANSACTION_ID", null, 2, null);
        int i3 = cancelAll + 63;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            return string$default;
        }
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity) {
        int i = 2 % 2;
        int i2 = notify + 47;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = termsAndConditionDeviceLinkingActivity.getIntent().getStringExtra("email");
        if (stringExtra == null) {
            int i4 = cancelAll + 55;
            notify = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        int i6 = cancelAll + 63;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return stringExtra;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity) {
        int i = 2 % 2;
        int i2 = notify + 59;
        cancelAll = i2 % 128;
        return i2 % 2 != 0 ? PreferenceManager.getString$default((PreferenceManager) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue(), "DEVICE_LINK_JENIS_FORM", null, 4, null) : PreferenceManager.getString$default((PreferenceManager) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue(), "DEVICE_LINK_JENIS_FORM", null, 2, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 101;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsAndConditionDeviceLinkingActivity, null, false, 6);
        termsAndConditionDeviceLinkingActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 23;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity) {
        int i = 2 % 2;
        int i2 = notify + 43;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            return termsAndConditionDeviceLinkingActivity.getIntent().getStringExtra("key_title_message");
        }
        termsAndConditionDeviceLinkingActivity.getIntent().getStringExtra("key_title_message");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String b(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity) {
        int i = 2 % 2;
        int i2 = notify + 103;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = termsAndConditionDeviceLinkingActivity.getIntent().getStringExtra("key_message");
        int i4 = notify + 105;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c2  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity = (TermsAndConditionDeviceLinkingActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        if (Intrinsics.areEqual((String) termsAndConditionDeviceLinkingActivity.g.getValue(), "PASPOR_OTP")) {
            DeviceUnlinkingVerificationActivity.Companion companion = DeviceUnlinkingVerificationActivity.INSTANCE;
            DeviceUnlinkingVerificationActivity.Companion.b(termsAndConditionDeviceLinkingActivity, (String) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), (String) termsAndConditionDeviceLinkingActivity.g.getValue(), (String) termsAndConditionDeviceLinkingActivity.a.getValue(), (String) termsAndConditionDeviceLinkingActivity.d.getValue(), (String) termsAndConditionDeviceLinkingActivity.asBinder.getValue());
        } else {
            int i2 = cancelAll + 29;
            notify = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual((String) termsAndConditionDeviceLinkingActivity.g.getValue(), "KTP_OTP");
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual((String) termsAndConditionDeviceLinkingActivity.g.getValue(), "KTP_OTP")) {
                DeviceUnlinkingVerificationActivity.Companion companion2 = DeviceUnlinkingVerificationActivity.INSTANCE;
                DeviceUnlinkingVerificationActivity.Companion.b(termsAndConditionDeviceLinkingActivity, (String) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), (String) termsAndConditionDeviceLinkingActivity.g.getValue(), (String) termsAndConditionDeviceLinkingActivity.a.getValue(), (String) termsAndConditionDeviceLinkingActivity.d.getValue(), (String) termsAndConditionDeviceLinkingActivity.asBinder.getValue());
            } else {
                int i3 = cancelAll + 99;
                notify = i3 % 128;
                int i4 = i3 % 2;
                if (Intrinsics.areEqual((String) termsAndConditionDeviceLinkingActivity.g.getValue(), "KTP_BIOMETRIK_KPJ") || Intrinsics.areEqual((String) termsAndConditionDeviceLinkingActivity.g.getValue(), "KTP_BIOMETRIK")) {
                    DeviceUnlinkingBiometricActivity.Companion companion3 = DeviceUnlinkingBiometricActivity.INSTANCE;
                    DeviceUnlinkingBiometricActivity.Companion.TuitionPaymentFragmentbindingInflater1(termsAndConditionDeviceLinkingActivity, (String) termsAndConditionDeviceLinkingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), (String) termsAndConditionDeviceLinkingActivity.g.getValue(), (String) termsAndConditionDeviceLinkingActivity.a.getValue(), (String) termsAndConditionDeviceLinkingActivity.d.getValue(), (String) termsAndConditionDeviceLinkingActivity.asBinder.getValue());
                } else {
                    LoginActivity.Companion companion4 = LoginActivity.INSTANCE;
                    LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsAndConditionDeviceLinkingActivity, null, false, 6);
                    termsAndConditionDeviceLinkingActivity.d_();
                    int i5 = cancelAll + 81;
                    notify = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(TermsAndConditionDeviceLinkingActivity termsAndConditionDeviceLinkingActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(-426869447, new Object[]{termsAndConditionDeviceLinkingActivity, view}, 426869449, CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static {
        cancel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = onTransact + 55;
        cancel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 41;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_terms_and_condition_device_linking;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancelAll + 65;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentbindingInflater1(-139318654, new Object[]{this}, 139318655, Bank.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Bank.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1296610086, CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuitionPaymentFragmentbindingInflater1(-1409765985, new Object[]{this, bundle}, 1409765985, Bank.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CrashlyticsReport.Session.Application.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 621294358);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 93;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        d = -6377398940819159759L;
        f517a = 355162791;
        INotificationSideChannel = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.$$c
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = 104 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.TermsAndConditionDeviceLinkingActivity.$$i(int, short, short):java.lang.String");
    }
}
