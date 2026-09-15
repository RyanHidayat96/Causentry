package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityNonSalariedWorkerConfirmationBinding;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1;
import com.bpjstku.presentation.membership.registration.PhoneVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.onPostExecute;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004R\u0015\u0010\b\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/nonsalariedworker/NonSalariedWorkerConfirmationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityNonSalariedWorkerConfirmationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onBackPressed", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "asBinder", "a", "LgetImeOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NonSalariedWorkerConfirmationActivity extends BindingBaseActivity<ActivityNonSalariedWorkerConfirmationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int asInterface;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: shouldCleanUp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NonSalariedWorkerConfirmationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -59, 10, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 224;
    private static int d = 1;
    private static int b = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i5)) | i;
        int i9 = ~i5;
        int i10 = ~i;
        int i11 = (~(i9 | i10)) | i4;
        int i12 = (~(i | i9 | i4)) | (~(i7 | i9 | i10)) | (~(i10 | i5 | i4));
        int i13 = i5 + i4 + i6 + ((-104759182) * i3) + ((-453318476) * i2);
        int i14 = i13 * i13;
        int i15 = (i5 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i6) + (711983104 * i3) + (1180696576 * i2) + (1022754816 * i14);
        int i16 = ((i5 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i6 * (-1431886867)) + (i3 * 722567050) + (i2 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 == 2) {
            int i18 = 2 % 2;
            int i19 = asBinder + 125;
            b = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        NonSalariedWorkerConfirmationActivity nonSalariedWorkerConfirmationActivity = (NonSalariedWorkerConfirmationActivity) objArr[0];
        int i21 = 2 % 2;
        int i22 = b + 15;
        asBinder = i22 % 128;
        int i23 = i22 % 2;
        NonSalariedWorkerConfirmationActivity nonSalariedWorkerConfirmationActivity2 = nonSalariedWorkerConfirmationActivity;
        Intrinsics.checkNotNullParameter(nonSalariedWorkerConfirmationActivity2, "");
        nonSalariedWorkerConfirmationActivity2.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityNonSalariedWorkerConfirmationBinding) ((ViewBinding) nonSalariedWorkerConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = nonSalariedWorkerConfirmationActivity.getString(R.string.title_non_salaried_registration);
        Intrinsics.checkNotNullExpressionValue(string, "");
        nonSalariedWorkerConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, false);
        int i24 = asBinder + 57;
        b = i24 % 128;
        int i25 = i24 % 2;
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
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r5 = 145 - r5
            byte[] r0 = com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity.$$a
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            int r7 = r7 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity.c(short, short, int, java.lang.Object[]):void");
    }

    public NonSalariedWorkerConfirmationActivity() {
        final NonSalariedWorkerConfirmationActivity nonSalariedWorkerConfirmationActivity = this;
        this.b = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getImeOptions, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getImeOptions invoke() {
                ComponentCallbacks componentCallbacks = nonSalariedWorkerConfirmationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getImeOptions.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/nonsalariedworker/NonSalariedWorkerConfirmationActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, NonSalariedWorkerConfirmationActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityNonSalariedWorkerConfirmationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = b + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            NonSalariedWorkerConfirmationActivity$bindingInflater$1 nonSalariedWorkerConfirmationActivity$bindingInflater$1 = NonSalariedWorkerConfirmationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            throw null;
        }
        NonSalariedWorkerConfirmationActivity$bindingInflater$1 nonSalariedWorkerConfirmationActivity$bindingInflater$2 = NonSalariedWorkerConfirmationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = asBinder + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        return nonSalariedWorkerConfirmationActivity$bindingInflater$2;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = b + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        PhoneVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = PhoneVerificationActivity.INSTANCE;
        PhoneVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        d_();
        int i4 = asBinder + 67;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = b + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onPostExecute.Companion tuitionPaymentFragmentbindingInflater1 = onPostExecute.INSTANCE;
        getSupportFragmentManager().beginTransaction().replace(R.id.containerConfirmation, onPostExecute.Companion.b((RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue())).commit();
        int i4 = asBinder + 11;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - View.MeasureSpec.getMode(0)), 1356 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 38 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 894276454, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 468, 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 0;
        NonSalariedWorkerConfirmationActivity nonSalariedWorkerConfirmationActivity = (NonSalariedWorkerConfirmationActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int mode = 1031 - View.MeasureSpec.getMode(0);
            int iArgb = 15 - Color.argb(0, 0, 0, 0);
            byte b2 = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 141, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, mode, iArgb, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{4144, 4177, 19060, 596, 9493, 61787, 62043, 27511, 9040, 1101, 53847, 29362, 3492, 34913, 16406, 59196, 45893, 43365, 24904, 50702, 37965, 52809, 34380, 41240, 30023, 61285}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{47663, 47690, 63765, 2966, 5271, 23384, 16696, 55320, 10903, 13745, 30786, 31605, 15396, 15120, 18835, 54939, 6474, 6680, 26782}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).codePointAt(5) - 96, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iBlue = Color.blue(0) + 1031;
            int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b3 = $$a[7];
            Object[] objArr6 = new Object[1];
            c((short) 89, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, iBlue, jumpTapTimeout, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int windowTouchSlop = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                Object[] objArr7 = new Object[1];
                c((short) 37, (byte) 52, $$a[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, windowTouchSlop, iMakeMeasureSpec, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr8[3])[0];
            int i4 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ~iElapsedRealtime;
            int i6 = ((((-2140082559) + (((~((-184015174) | i5)) | 43487236) * 168)) + ((~((-43487237) | iElapsedRealtime)) * 168)) + (((~(iElapsedRealtime | (-140527938))) | ((~(i5 | (-60264997))) | 16777760)) * 168)) - 490681210;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr2[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{40957, 40855, 65259, 57784, 23014, 32471, 18123, 57314, 49323, 30957, 23954, 37196, 28996, 15532, 41877, 39926, 15490, 7666, 33447, 47846}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{56753, 56792, 31240, 46428, 47767, 15553, 49709, 23297, 37961, 39812, 8177, 50619, 37434, 47109, 63298, 30873, 32510, 39183, 54865, 22928}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 105, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, nonSalariedWorkerConfirmationActivity)).intValue();
            try {
                Object[] objArr11 = {1310393503};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46086 - AndroidCharacter.getMirror('0')), Drawable.resolveOpacity(0, 0) + 1134, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -490681210, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cGreen = (char) Color.green(0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                    int iAlpha = 15 - Color.alpha(0);
                    byte b4 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c((short) 141, b4, b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, packedPositionChild, iAlpha, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1117, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int iMyPid = (Process.myPid() >> 22) + 1031;
                    int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr14 = new Object[1];
                    c((short) 37, (byte) 52, $$a[5], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iMyPid, longPressTimeout, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{4144, 4177, 19060, 596, 9493, 61787, 62043, 27511, 9040, 1101, 53847, 29362, 3492, 34913, 16406, 59196, 45893, 43365, 24904, 50702, 37965, 52809, 34380, 41240, 30023, 61285}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_shopeepay_qris).substring(0, 10).length() - 9, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{47663, 47690, 63765, 2966, 5271, 23384, 16696, 55320, 10903, 13745, 30786, 31605, 15396, 15120, 18835, 54939, 6474, 6680, 26782}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                        int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 89, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i9, i10, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                        int iRed = Color.red(0) + 15;
                        byte b6 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        c((short) 141, b6, b6, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf3, i11, iRed, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i12 = asBinder + 101;
                b = i12 % 128;
                int i13 = i12 % 2;
                while (i < strArr2.length) {
                    int i14 = asBinder + 51;
                    b = i14 % 128;
                    if (i14 % 2 != 0) {
                        arrayList.add(strArr2[i]);
                        i += 85;
                    } else {
                        arrayList.add(strArr2[i]);
                        i++;
                    }
                }
            }
            throw null;
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr2[2])[0];
        int i16 = ((int[]) objArr2[3])[0];
        int i17 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int i18 = ~((int) SystemClock.elapsedRealtime());
        int i19 = i15 + 80935821 + ((~((-26289345) | i18)) * 52) + (((~(908368190 | i18)) | (~(664088020 | i18)) | (-934657535)) * (-52)) + (((~(i18 | (-908368191))) | 637798676) * 52);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr19[2])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cBlue = (char) (Color.blue(0) + 29944);
            int i22 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            Object[] objArr20 = new Object[1];
            c((short) 37, (byte) 15, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cBlue, i22, keyRepeatTimeout, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i23 = asBinder + 111;
            b = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                int iRed2 = Color.red(0) + 1755;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                byte b7 = $$a[7];
                Object[] objArr21 = new Object[1];
                c((short) 89, b7, b7, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionChild2, iRed2, iNormalizeMetaState, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i25 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i25}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i26 = (int) Runtime.getRuntime().totalMemory();
            int i27 = ((((-120790168) + (((~((-702516515) | i26)) | 550273282) * 345)) + (((~((-702516515) | (~i26))) | (-1040187371)) * 345)) + ((~(i26 | (-550273283))) * 345)) - 827984551;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{40957, 40855, 65259, 57784, 23014, 32471, 18123, 57314, 49323, 30957, 23954, 37196, 28996, 15532, 41877, 39926, 15490, 7666, 33447, 47846}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 45, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{56753, 56792, 31240, 46428, 47767, 15553, 49709, 23297, 37961, 39812, 8177, 50619, 37434, 47109, 63298, 30873, 32510, 39183, 54865, 22928}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, nonSalariedWorkerConfirmationActivity)).intValue();
            Object[] objArr25 = {1310393503};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.MeasureSpec.getSize(0) + 42049), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -827984551, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                int iAlpha2 = 23 - Color.alpha(0);
                byte b8 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 89, b8, b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cArgb, tapTimeout, iAlpha2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{4144, 4177, 19060, 596, 9493, 61787, 62043, 27511, 9040, 1101, 53847, 29362, 3492, 34913, 16406, 59196, 45893, 43365, 24904, 50702, 37965, 52809, 34380, 41240, 30023, 61285}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{47663, 47690, 63765, 2966, 5271, 23384, 16696, 55320, 10903, 13745, 30786, 31605, 15396, 15120, 18835, 54939, 6474, 6680, 26782}, View.resolveSize(0, 0) + 1, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int i30 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    short s = $$a[7];
                    byte b9 = (byte) s;
                    Object[] objArr29 = new Object[1];
                    c(s, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iLastIndexOf, i30, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int i31 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr30 = new Object[1];
                    c((short) 37, (byte) 15, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(jumpTapTimeout2, iResolveOpacity, i31, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i33 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i33 == i32) {
            int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i35 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr31 = {new int[]{i35}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iMyPid2 = Process.myPid();
            int i36 = ~iMyPid2;
            int i37 = i34 + (-1917404935) + ((168847748 | i36) * (-192)) + (((~(504392580 | i36)) | 548147258) * (-384)) + (((~(iMyPid2 | (-335544833))) | (~(i36 | 1052539838)) | (~((-548147259) | iMyPid2))) * DerHeader.TAG_CLASS_PRIVATE);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[3])[0] = i39 ^ (i39 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr4 != null) {
            int i40 = 0;
            while (i40 < strArr4.length) {
                int i41 = asBinder + 31;
                b = i41 % 128;
                if (i41 % 2 != 0) {
                    arrayList2.add(strArr4[i40]);
                    i40 += 51;
                } else {
                    arrayList2.add(strArr4[i40]);
                    i40++;
                }
            }
        }
        int[] iArr = new int[i33];
        int i42 = i33 - 1;
        iArr[i42] = 1;
        Toast.makeText((Context) null, iArr[((i33 * i42) % 2) - 1], 1).show();
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr32 = {new int[]{i44}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i45 = ~Process.myUid();
        int i46 = i43 + (-1949419815) + (((~(i45 | 338048991)) | 56100896) * (-160)) + (((~(i45 | 125446565)) | 338048991) * 160);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[3])[0] = i48 ^ (i48 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = b + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1141717619;
            if (i3 != 959287048 + ((~((~length) | (-1367384344))) * (-116)) + ((545150688 | length) * 116) + (((~(length | 1375138231)) | 537396800) * 116)) {
                throw null;
            }
        } else {
            int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i6 = ~i5;
            int i7 = (~(1418666681 | i6)) | (-2006951932) | (~(588679138 | i6));
            if (i4 != 246952352 + (((~(i5 | (-393889))) | i7) * 590) + (i7 * (-1180)) + (((~((-588679139) | i6)) | (~(i6 | (-1418666682)))) * 590)) {
                throw null;
            }
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int integer = (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_height) & (-865)) + 1937090999;
        int i9 = ~integer;
        if (i8 != 767966968 + ((2008593372 | i9) * (-369)) + (((~((-587248537) | i9)) | 1991807428) * (-369)) + (((~(integer | 587248536)) | 1421344836 | (~(i9 | (-16785945)))) * 369)) {
            int i10 = 1307918570 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i11 = asBinder + 107;
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = b + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i5 = (-1777901176) + (((~(747903693 | iUptimeMillis)) | (-1577891237)) * 672);
        int i6 = ~iUptimeMillis;
        if (i4 != i5 + (((~(iUptimeMillis | (-1577891237))) | (~((-747903694) | i6))) * (-672)) + (((~(1577891236 | i6)) | (-2124201966)) * 672)) {
            throw null;
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ~((int) SystemClock.elapsedRealtime());
        if (i7 != (((-856319252) + (((~(i8 | 2138389839)) | 440666125) * (-828))) + ((i8 | 2138389839) * (-828))) - 1060261568) {
            throw null;
        }
        super.onStart();
        int i9 = asBinder + 71;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        if (i4 != 1168966376 + (((~(1843105728 | i5)) | 270561321) * 336) + (((~(i5 | 1013118185)) | 1100548864) * (-168)) + (((~((~i5) | 1013118185)) | 1843105728) * 168)) {
            int i6 = 1096619422 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1412664118;
        int i8 = ~iCodePointAt;
        int i9 = (~((-517920314) | i8)) | 450512417;
        int i10 = ~(iCodePointAt | 2128543547);
        if (i7 != 1103022610 + ((i9 | i10) * (-502)) + ((i10 | (~(i8 | (-67407897)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            int i11 = (-2054597976) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i12 = b + 17;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ RegistrationForUnregistered b(NonSalariedWorkerConfirmationActivity nonSalariedWorkerConfirmationActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = nonSalariedWorkerConfirmationActivity.getIntent().getParcelableExtra("unregistered_data");
        Intrinsics.checkNotNull(parcelableExtra);
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) parcelableExtra;
        int i4 = b + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return registrationForUnregistered;
    }

    static {
        asInterface = 0;
        d();
        INSTANCE = new Companion(null);
        int i = d + 79;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 87;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        b = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_non_salaried_worker_confirmation;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = b + 53;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b(), ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b(), -1409624896, 1409624898, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 361195113);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 192994509, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 2111661307, -2013376502, 2013376502, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = b + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, context}, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_shipping_billing_address).substring(0, 26).length() - 1315553113, 836808689, -836808688, ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b());
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -560945347544067545L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity.$$c
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r6 = r6 * 3
            int r6 = 107 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
        L27:
            int r8 = r8 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity.$$i(int, short, int):java.lang.String");
    }
}
