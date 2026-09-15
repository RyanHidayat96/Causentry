package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.cropJpegByteArray;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getPreviewCapabilities;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.mapPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0010\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0015\u0010\f\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0015\u0010\t\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/nonsalariedworker/TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "onTransact", "()LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity extends BindingBaseActivity<ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f562a;
    private static long asBinder;
    private static int cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 204;
    private static int g = 0;
    private static int d = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: CustomTabsClient26
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: CustomTabsClient25
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.b(this.b));
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: CustomTabsClient24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1));
        }
    });

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -445565939
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r7, int r8, int r9, int r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
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
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            int r6 = 144 - r6
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.c(short, short, short, java.lang.Object[]):void");
    }

    public TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity() {
        final TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = termsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/nonsalariedworker/TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, boolean z, boolean z2, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.class);
            intent.putExtra("key_sertakan_deeplink", z);
            intent.putExtra("key_bpu_deeplink", z2);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity$bindingInflater$1 termsAndConditionRegistrationNonSalariedWorkerParticipantActivity$bindingInflater$1 = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = asInterface + 125;
        d = i4 % 128;
        int i5 = i4 % 2;
        return termsAndConditionRegistrationNonSalariedWorkerParticipantActivity$bindingInflater$1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x01bd  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 57;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(f562a[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 2;
                    byte b2 = (byte) (b - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 2188, Color.argb(0, 0, 0, 0) + 40, 841711447, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asBinder), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 33017), 3011 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, 321985076, false, $$i(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c3 = (char) (36505 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int packedPositionType = 3376 - ExpandableListView.getPackedPositionType(0L);
                    int scrollDefaultDelay = 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b5 = (byte) ($$f & 7);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, packedPositionType, scrollDefaultDelay, -968507904, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i7 = $10 + 93;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c2, 0, 0) + 36506);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 3376;
                int pressedStateDuration2 = 17 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b7 = (byte) ($$f & 7);
                byte b8 = (byte) (b7 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, pressedStateDuration, pressedStateDuration2, -968507904, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i9 = $11 + 71;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            c2 = '0';
        }
        objArr[0] = new String(cArr);
    }

    private final ActivityResultContractsPickVisualMediaMediaCapabilities onTransact() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = asInterface + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int i4 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iArgb = 44 - Color.argb(0, 0, 0, 0);
            Object[] objArr2 = new Object[1];
            c((short) 141, (byte) 52, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, iArgb, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_cards).substring(1, 2).length() - 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_payment).substring(6, 7).length() - 1), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copy_payment_code).substring(9, 10).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_akulaku).substring(18, 21).codePointAt(0) - 82, (char) Color.red(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iAxisFromString = 650 - MotionEvent.axisFromString("");
            int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c((short) (bArr[0] + 1), bArr[7], bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iAxisFromString, edgeSlop, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iBlue = 651 - Color.blue(0);
                int i5 = 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((short) (bArr2[0] + 1), (byte) 37, bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iBlue, i5, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~((-8694435) | iIdentityHashCode);
            int i9 = ~iIdentityHashCode;
            int i10 = (((1142053825 + ((i8 | (~(316604398 | i9))) * 920)) + (((~((-311340775) | i9)) | 8694434) * 920)) + (((~(iIdentityHashCode | 316604398)) | ((~((-8694435) | i9)) | (~((-302646341) | iIdentityHashCode)))) * 920)) - 1150091689;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            c = 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1610, 26 - (ViewConfiguration.getPressedStateDuration() >> 16), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1150091689, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 651;
                    int i13 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    c((short) (bArr3[0] + 1), bArr3[7], bArr3[5], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, iMyTid, i13, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0')), 694 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 98 - TextUtils.getTrimmedLength("")), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - TextUtils.indexOf((CharSequence) "", '0')), 793 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 44;
                    byte[] bArr4 = $$a;
                    Object[] objArr10 = new Object[1];
                    c((short) (bArr4[0] + 1), (byte) 37, bArr4[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, maxKeyCode, deadChar, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    e(View.combineMeasuredStates(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1062).substring(0, 26).length() - 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int size = 651 - View.MeasureSpec.getSize(0);
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43;
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((short) (bArr5[0] + 1), bArr5[7], bArr5[5], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, size, i14, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 652;
                        int iRed = Color.red(0) + 44;
                        Object[] objArr14 = new Object[1];
                        c((short) 141, (byte) 52, $$a[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop2, iIndexOf, iRed, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i15 = d + 49;
                    asInterface = i15 % 128;
                    c = 2;
                    int i16 = i15 % 2;
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
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[c])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i19 = d + 123;
                asInterface = i19 % 128;
                int i20 = i19 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        Object[] objArr15 = new Object[4];
        objArr15[0] = new int[]{i};
        objArr15[c] = new int[]{i};
        objArr15[3] = new int[1];
        int i21 = ((int[]) objArr[3])[0];
        int i22 = ((int[]) objArr[c])[0];
        int i23 = ((int[]) objArr[0])[0];
        objArr15[1] = new String[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step9).substring(20, 21).codePointAt(0) + 913220697;
        int i24 = ~iCodePointAt;
        int i25 = i21 + (-572945103) + (((~(241137888 | i24)) | 8421914) * 168) + ((~((-8421915) | iCodePointAt)) * 168) + (((~(iCodePointAt | 249559802)) | (~(i24 | (-244568699))) | 236146784) * 168);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr15[3])[0] = i27 ^ (i27 << 5);
        int i28 = d + 91;
        asInterface = i28 % 128;
        int i29 = i28 % 2;
        return (ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.getValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding activityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding = (ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        MaterialButton materialButton = activityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding.btnConfirm;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CustomTabsClient23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.b(this.b, (View) obj);
            }
        }));
        MaterialButton materialButton2 = activityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CustomTabsFeaturesCustomTabsFeature
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = asInterface + 7;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        d = i2 % 128;
        int i3 = i2 % 2;
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity = this;
        Intrinsics.checkNotNullParameter(termsAndConditionRegistrationNonSalariedWorkerParticipantActivity, "");
        termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_terms_condition_non_salaried_registration);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, false);
        int i4 = d + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
            int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
            int iMyTid = 23 - (Process.myTid() >> 22);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((short) (bArr[0] + 1), (byte) 37, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, i2, iMyTid, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = asInterface + 69;
            d = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                short s = (short) 52;
                Object[] objArr3 = new Object[1];
                c(s, (byte) s, $$a[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, i5, i6, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step2).substring(227, 231).length() + 1463169607;
            int i7 = ~length;
            int i8 = (-1144866607) + (((~(841342183 | i7)) | 214967040) * 168) + ((~((-214967041) | length)) * 168) + (((~(length | 1056309223)) | (~(i7 | (-1053944610))) | 838977569) * 168) + 1988148649;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klikbca_instruction_2).substring(3, 4).codePointAt(0) - 60, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_1).substring(4, 5).length() + 15, (char) ((Process.myTid() >> 22) + 36695), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(53 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(3) - 84, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_clickpay).substring(0, 16).length() + 27272), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1430659183};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1726, 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1988148649, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                    int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                    short s2 = (short) 52;
                    Object[] objArr8 = new Object[1];
                    c(s2, (byte) s2, $$a[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, iIndexOf, minimumFlingVelocity, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_no_network_message).substring(0, 23).length() - 23, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                        Object[] objArr11 = new Object[1];
                        c((short) 141, (byte) 52, $$a[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarSize, offsetAfter, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (Color.blue(0) + 29944);
                        int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr2 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((short) (bArr2[0] + 1), (byte) 37, bArr2[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, iIndexOf2, packedPositionGroup2, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i14 = i13 + 626465278 + (((~(iMaxMemory | 45129234)) | (-167473192)) * (-465)) + ((45129234 | (~((-167473192) | iMaxMemory))) * 930) + ((iMaxMemory | (-155934758)) * 465);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i17 = i12 - 1;
            iArr[i17] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i17) % 2) - 1], 1).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i20 = ~((-34373693) | i19);
            int i21 = ~i19;
            int i22 = i18 + 1827235340 + ((i20 | (~((-1115521) | i21))) * 497) + (((~(i19 | (-1115521))) | (~((-177113214) | i21)) | 142739521) * 497);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
            int size = 15 - View.MeasureSpec.getSize(0);
            byte b = $$a[7];
            short s3 = b;
            Object[] objArr15 = new Object[1];
            c(s3, (byte) (s3 | 52), b, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, pressedStateDuration, size, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 94, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).codePointAt(6) - 83), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_authentication_error).substring(33, 34).codePointAt(0) - 86, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_generating_key_hash).substring(0, 35).length() - 35), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i25 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int iResolveSize = View.resolveSize(0, 0) + 15;
            short s4 = (short) 52;
            Object[] objArr18 = new Object[1];
            c(s4, (byte) s4, $$a[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, i25, iResolveSize, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i26 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iGreen = 15 - Color.green(0);
                byte[] bArr3 = $$a;
                Object[] objArr19 = new Object[1];
                c((short) (bArr3[0] + 1), bArr3[7], bArr3[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, i26, iGreen, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr20[3])[0];
            int i28 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i29 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels) | 949233866);
            int i30 = ((((671361088 | i29) * (-374)) + 1380020045) + ((i29 | 277872778) * 374)) - 746570258;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_message_link).substring(0, 22).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (Drawable.resolveOpacity(0, 0) + 36695), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17, ((Process.getThreadPriority(0) + 20) >> 6) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 27252), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1430659183};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46037), Color.green(0) + 1134, MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -746570258, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int i33 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 15;
                byte b2 = $$a[7];
                short s5 = b2;
                Object[] objArr25 = new Object[1];
                c(s5, (byte) (s5 | 52), b2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, i33, packedPositionGroup3, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45992), 1117 - View.combineMeasuredStates(0, 0), (Process.myTid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int mirror = 1079 - AndroidCharacter.getMirror('0');
                int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                byte[] bArr4 = $$a;
                Object[] objArr26 = new Object[1];
                c((short) (bArr4[0] + 1), bArr4[7], bArr4[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, mirror, iKeyCodeFromString, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step6).substring(28, 29).codePointAt(0) - 24, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.try_again).substring(6, 7).codePointAt(0) - 97), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char packedPositionGroup4 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i34 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    short s6 = (short) 52;
                    Object[] objArr29 = new Object[1];
                    c(s6, (byte) s6, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionGroup4, longPressTimeout, i34, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                    int i35 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b3 = $$a[7];
                    short s7 = b3;
                    Object[] objArr30 = new Object[1];
                    c(s7, (byte) (s7 | 52), b3, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMakeMeasureSpec, fadingEdgeLength, i35, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i36 = d + 115;
                asInterface = i36 % 128;
                int i37 = i36 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArr[1])[0];
        int i39 = ((int[]) objArr[3])[0];
        if (i39 == i38) {
            int i40 = d + 89;
            asInterface = i40 % 128;
            int i41 = i40 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i42 = ((int[]) objArr[2])[0];
            int i43 = ((int[]) objArr[3])[0];
            int i44 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i46 = ~i45;
            int i47 = i42 + 304192432 + (((~(i46 | (-769383400))) | 26253478 | (~((-270533649) | i45))) * 717) + (((~(i45 | (-769383400))) | (~(i46 | (-270533649))) | 26253478) * 717);
            int i48 = i47 ^ (i47 << 13);
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr31[2])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i50 = d + 77;
            asInterface = i50 % 128;
            int i51 = i50 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr2 = new int[i39];
        int i52 = i39 - 1;
        iArr2[i52] = 1;
        Toast.makeText((Context) null, iArr2[((i39 * i52) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i53 = ((int[]) objArr[2])[0];
        int i54 = ((int[]) objArr[3])[0];
        int i55 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i56 = i53 + 1739565539 + (((~startElapsedRealtime) | 386958720) * 1324) + (((~(startElapsedRealtime | (-684554783))) | (~(928834952 | startElapsedRealtime))) * (-1324)) + 1567444870;
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[2])[0] = i58 ^ (i58 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -713055572
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iMyPid = Process.myPid();
            int i4 = ~(1788169825 | iMyPid);
            int i5 = ~iMyPid;
            int i6 = i4 | (~(958182282 | i5));
            int i7 = ~((-1788169826) | i5);
            if (i3 != (-608467592) + ((i6 | i7) * (-516)) + (((~(iMyPid | (-285782411))) | (~((-672399873) | i5))) * 516) + ((672399872 | i7) * 516)) {
                throw null;
            }
        } else {
            int i8 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iNextInt = new Random().nextInt();
            int i9 = ~iNextInt;
            if (i8 != (-1284624667) + (((~((-53814656) | i9)) | (-883802199)) * (-602)) + (((~(iNextInt | (-53814656))) | 51389737 | (~((-881377281) | i9))) * (-301)) + ((~(i9 | (-883802199))) * 301)) {
                throw null;
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto4_bni).substring(14, 15).length() + 2084468640;
        int i11 = ~length;
        if (i10 != 942615536 + (((~((-780058785) | i11)) | (~((-1798997181) | i11))) * (-867)) + (((~((-780058785) | length)) | 708477088 | (~((-1798997181) | length))) * (-1734)) + (((~(length | (-1090520093))) | (~(i11 | (-708477089))) | (~((-71581697) | length))) * 867)) {
            int i12 = 1850386234 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i13 = d + 9;
        asInterface = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity) {
        int i = 2 % 2;
        int i2 = d + 109;
        asInterface = i2 % 128;
        boolean booleanExtra = i2 % 2 == 0 ? termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.getIntent().getBooleanExtra("key_bpu_deeplink", false) : termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.getIntent().getBooleanExtra("key_bpu_deeplink", false);
        int i3 = asInterface + 77;
        d = i3 % 128;
        int i4 = i3 % 2;
        return booleanExtra;
    }

    public static /* synthetic */ boolean b(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity) {
        int i = 2 % 2;
        int i2 = d + 121;
        asInterface = i2 % 128;
        boolean booleanExtra = i2 % 2 == 0 ? termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.getIntent().getBooleanExtra("key_sertakan_deeplink", true) : termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.getIntent().getBooleanExtra("key_sertakan_deeplink", false);
        int i3 = asInterface + 31;
        d = i3 % 128;
        int i4 = i3 % 2;
        return booleanExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Unit b(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity, View view) {
        boolean z;
        boolean z2;
        String str;
        boolean zBooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (((User) termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) == null) {
            int i2 = asInterface + 57;
            d = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        RegistrationForUnregistered registrationForUnregistered = new RegistrationForUnregistered(null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, ViewCompat.MEASURED_SIZE_MASK, null);
        MembershipType membershipType = MembershipType.BPU;
        Boolean boolValueOf = Boolean.valueOf(((Boolean) termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.asInterface.getValue()).booleanValue());
        if (!((Boolean) termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.asInterface.getValue()).booleanValue()) {
            int i4 = asInterface + 59;
            d = i4 % 128;
            int i5 = i4 % 2;
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            int i6 = d + 105;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                zBooleanValue = boolValueOf.booleanValue();
                int i7 = 37 / 0;
            } else {
                zBooleanValue = boolValueOf.booleanValue();
            }
            z2 = zBooleanValue;
        } else {
            z2 = false;
        }
        User userAsBinder = termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.onTransact().TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (z) {
            str2 = null;
        }
        String str3 = str2 == null ? "" : str2;
        String str4 = !z ? "cross_selling" : null;
        if (str4 == null) {
            int i8 = asInterface + 91;
            d = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str = "";
        } else {
            str = str4;
        }
        Boolean boolValueOf2 = z ? null : Boolean.valueOf(((Boolean) termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).booleanValue());
        RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, membershipType, null, str, boolValueOf2 != null ? boolValueOf2.booleanValue() : false, z2, 1572859);
        if (z) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsAndConditionRegistrationNonSalariedWorkerParticipantActivity, getMaxImages.INSTANCE.onItemLoaded(), "Pendaftaran BPU", 0, null, false, 56);
        } else {
            NonSalariedWorkerRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = NonSalariedWorkerRegistrationActivity.INSTANCE;
            NonSalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsAndConditionRegistrationNonSalariedWorkerParticipantActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity = (TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.onTransact().TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = asInterface + 97;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return userAsBinder;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        termsAndConditionRegistrationNonSalariedWorkerParticipantActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 93;
        d = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity termsAndConditionRegistrationNonSalariedWorkerParticipantActivity) {
        return (User) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{termsAndConditionRegistrationNonSalariedWorkerParticipantActivity}, -244909160, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 244909160);
    }

    static {
        cancelAll = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 43;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 11;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_terms_and_condition_registration_non_salaried_worker_participant;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = d + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -951033305, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1902083233 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 951033307);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, 2079744954, cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), (-1558279989) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_8).substring(21, 22).length(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2079744953);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        f562a = new char[]{45565, 5014, 62768, 22210, 14435, 39425, 32672, 49422, 41683, 1131, 58970, 19331, 11605, 36603, 20624, 12837, 38833, 31099, 56056, 48287, 7727, 58307, 45561, 5012, 62773, 22208, 14463, 39437, 32672, 49522, 41689, 1145, 58904, 19364, 11589, 36581, 20609, 16033, 40142, 31349, 55686, 46965, 5459, 61682, 19993, 11660, 35681, 26992, 50430, 41480, 427, 57302, 48506, 56173, 30980, 40873, 15430, 21216, 61593, 5416, 43969, 51308, 28385, 35999, 8480, 18423, 58495, 14872, 22717};
        asBinder = -101875500162018312L;
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
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.$$c
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
