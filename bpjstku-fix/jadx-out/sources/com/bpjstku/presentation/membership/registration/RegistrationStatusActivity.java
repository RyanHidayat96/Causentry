package com.bpjstku.presentation.membership.registration;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityParticipantRegistrationStatusBinding;
import com.bpjstku.presentation.membership.registration.RegistrationStatusActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.RegistrationStatus;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.google.android.material.button.MaterialButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CaptureSession1;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMeteringRect;
import defpackage.initSession;
import defpackage.runQueryOnBackgroundThread;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00158\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationStatusActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityParticipantRegistrationStatusBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationStatusActivity extends BindingBaseActivity<ActivityParticipantRegistrationStatusBinding> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static int g;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -59, 10, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 119;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f547a = 0;
    private static int asInterface = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.activity_participant_registration_status;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: SuggestionsAdapterChildViewCache
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationStatusActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1591606216
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r7, int r8, int r9, int r10, int r11, java.lang.Object[] r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int, int, int, int, java.lang.Object[], int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationStatusActivity.$$a
            int r6 = 197 - r6
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationStatusActivity.c(short, int, short, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityParticipantRegistrationStatusBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        RegistrationStatusActivity$bindingInflater$1 registrationStatusActivity$bindingInflater$1 = RegistrationStatusActivity$bindingInflater$1.b;
        if (i3 != 0) {
            return registrationStatusActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            int i5 = 43 / 0;
        }
        return i4;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.RegistrationStatusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationStatusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationStatusActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        RegistrationStatusActivity registrationStatusActivity = (RegistrationStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        RegistrationStatusActivity registrationStatusActivity2 = registrationStatusActivity;
        Intrinsics.checkNotNullParameter(registrationStatusActivity2, "");
        registrationStatusActivity2.getWindow().addFlags(8192);
        registrationStatusActivity.TuitionPaymentFragmentbindingInflater1(((ActivityParticipantRegistrationStatusBinding) ((ViewBinding) registrationStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityParticipantRegistrationStatusBinding) ((ViewBinding) registrationStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(registrationStatusActivity.getString(R.string.label_string_null));
        int i4 = asInterface + 75;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityParticipantRegistrationStatusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnAlreadyRegistered;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: SwitchCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationStatusActivity.b(this.b, (View) obj);
            }
        }));
        MaterialButton materialButton2 = ((ActivityParticipantRegistrationStatusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnRegisterNewUser;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new runQueryOnBackgroundThread(this)));
        int i2 = asInterface + 69;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = asInterface + 27;
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = asInterface + 71;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr2;
        int i = 0;
        RegistrationStatusActivity registrationStatusActivity = (RegistrationStatusActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
            int i3 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i4 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b = $$a[5];
            Object[] objArr3 = new Object[1];
            c(b, (short) (b | 192), (byte) ($$b & 173), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, i3, i4, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i5 = d + 91;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                Object[] objArr4 = new Object[1];
                c($$a[5], (short) 156, (byte) ($$b & 188), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, deadChar, iIndexOf, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i7 = ((int[]) objArr5[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i7}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i8 = ~elapsedCpuTime;
            int i9 = 1887099739 + (((~((-419641737) | i8)) | (-207039311)) * (-602)) + (((~(elapsedCpuTime | (-419641737))) | 285216896 | (~((-72614471) | i8))) * (-301)) + ((~(i8 | (-207039311))) * 301) + 1128151790;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{20229, 53294, 30331, 39676}, new char[]{51218, 2914, 278, 37886}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 64989), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redirecting_to_gopay).substring(1, 2).codePointAt(0) - 101, new char[]{52907, 22793, 43598, 41290, 25945, 8761, 45690, 29236, 7358, 27800, 38897, 2104, 63734, 35353, 1406, 49069}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{20229, 53294, 30331, 39676}, new char[]{18963, 34724, 29569, 14710}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 30277), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{34483, 44350, 2044, 62874, 47982, 5628, 33847, 16238, 38183, 25812, 52947, 26303, 35364, 38115, 45258, 22848}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, registrationStatusActivity)).intValue();
            try {
                Object[] objArr8 = {1833969422};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 42049), 1727 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 28 - TextUtils.lastIndexOf("", '0', 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 1128151790);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                    int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                    Object[] objArr9 = new Object[1];
                    c($$a[5], (short) 156, (byte) ($$b & 188), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, trimmedLength, maximumFlingVelocity, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{20229, 53294, 30331, 39676}, new char[]{27126, 8572, 63367, 23104}, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_not_equal).substring(5, 6).length() - 1, new char[]{46641, 64741, 38778, 5600, 35857, 31860, 6657, 20573, 870, 36864, 19200, 14696, 38212, 39123, 56586, 40822, 18207, 54603, 24617, 26999, 20772, 44606}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{20229, 53294, 30331, 39676}, new char[]{27177, 30387, 13506, 8588}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 35856), TextUtils.indexOf((CharSequence) "", '0', 0) - 1032408213, new char[]{25725, 53858, 28721, 10859, 29678, 6634, 36455, 10105, 14811, 33813, 18770, 42092, 4846, 51636, 8232}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                        short s = (short) 104;
                        Object[] objArr12 = new Object[1];
                        c($$a[5], s, (byte) (s >>> 1), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, i12, scrollDefaultDelay, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
                        int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0);
                        byte b2 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        c(b2, (short) (b2 | 192), (byte) ($$b & 173), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, iIndexOf2, iIndexOf3, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = d + 95;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                int i15 = asInterface + 97;
                d = i15 % 128;
                int i16 = i15 % 2;
                while (i < strArr.length) {
                    arrayList.add(strArr[i]);
                    i++;
                }
            }
            throw null;
        }
        int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        int i18 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        Object[] objArr14 = {new int[]{i18}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i19 = ~new Random().nextInt(2051502681);
        int i20 = i17 + 2093440671 + ((~((-537092154) | i19)) * (-783)) + (((~(i19 | (-612590336))) | (-825192762)) * 783);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
            int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
            byte b3 = $$a[5];
            short s2 = (short) ($$b & 188);
            Object[] objArr15 = new Object[1];
            c(b3, s2, (byte) s2, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMakeMeasureSpec, capsMode, iNormalizeMetaState, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{20229, 53294, 30331, 39676}, new char[]{27126, 8572, 63367, 23104}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app_tablet).substring(29, 36).length() - 7), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116, new char[]{46641, 64741, 38778, 5600, 35857, 31860, 6657, 20573, 870, 36864, 19200, 14696, 38212, 39123, 56586, 40822, 18207, 54603, 24617, 26999, 20772, 44606}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{20229, 53294, 30331, 39676}, new char[]{27177, 30387, 13506, 8588}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35881), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1032408225, new char[]{25725, 53858, 28721, 10859, 29678, 6634, 36455, 10105, 14811, 33813, 18770, 42092, 4846, 51636, 8232}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            Object[] objArr18 = new Object[1];
            c($$a[5], (short) 156, (byte) ($$b & 188), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout, iLastIndexOf, iArgb, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i23 = asInterface + 75;
            d = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                int i25 = 15 + (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b4 = $$a[7];
                short s3 = b4;
                Object[] objArr19 = new Object[1];
                c(b4, s3, (byte) s3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, packedPositionChild, i25, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr20[3])[0];
            int i27 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i28 = ~elapsedCpuTime2;
            int i29 = 189349314 + (((-67125401) | i28) * (-369)) + (((~((-317701992) | i28)) | (-73421822)) * (-369)) + (((~(elapsedCpuTime2 | 317701991)) | (-384827392) | (~(i28 | (-6296422)))) * 369) + 716643663;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{20229, 53294, 30331, 39676}, new char[]{51218, 2914, 278, 37886}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step1).substring(0, 1).codePointAt(0) + 64945), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{52907, 22793, 43598, 41290, 25945, 8761, 45690, 29236, 7358, 27800, 38897, 2104, 63734, 35353, 1406, 49069}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{20229, 53294, 30331, 39676}, new char[]{18963, 34724, 29569, 14710}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 30324), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).length() - 1, new char[]{34483, 44350, 2044, 62874, 47982, 5628, 33847, 16238, 38183, 25812, 52947, 26303, 35364, 38115, 45258, 22848}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, registrationStatusActivity)).intValue();
            Object[] objArr23 = {1833969422};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 46038), 1134 - View.MeasureSpec.getMode(0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 716643663, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int capsMode2 = 1031 - TextUtils.getCapsMode("", 0, 0);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                byte b5 = $$a[5];
                short s4 = (short) ($$b & 188);
                Object[] objArr25 = new Object[1];
                c(b5, s4, (byte) s4, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cResolveSizeAndState, capsMode2, doubleTapTimeout, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (Process.myTid() >> 22)), View.combineMeasuredStates(0, 0) + 1117, KeyEvent.getDeadChar(0, 0) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int iGreen = Color.green(0) + 1031;
                int offsetBefore2 = 15 - TextUtils.getOffsetBefore("", 0);
                byte b6 = $$a[7];
                short s5 = b6;
                Object[] objArr26 = new Object[1];
                c(b6, s5, (byte) s5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarSize, iGreen, offsetBefore2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{20229, 53294, 30331, 39676}, new char[]{27126, 8572, 63367, 23104}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step4).substring(29, 32).length() - 3), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{46641, 64741, 38778, 5600, 35857, 31860, 6657, 20573, 870, 36864, 19200, 14696, 38212, 39123, 56586, 40822, 18207, 54603, 24617, 26999, 20772, 44606}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{20229, 53294, 30331, 39676}, new char[]{27177, 30387, 13506, 8588}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 35776), (-1032408331) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10), new char[]{25725, 53858, 28721, 10859, 29678, 6634, 36455, 10105, 14811, 33813, 18770, 42092, 4846, 51636, 8232}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                    Object[] objArr29 = new Object[1];
                    c($$a[5], (short) 156, (byte) ($$b & 188), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarFadeDuration, tapTimeout, doubleTapTimeout2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i32 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b7 = $$a[5];
                    short s6 = (short) ($$b & 188);
                    Object[] objArr30 = new Object[1];
                    c(b7, s6, (byte) s6, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop, jumpTapTimeout, i32, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i33 = asInterface + 73;
                d = i33 % 128;
                int i34 = i33 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                while (i < strArr3.length) {
                    arrayList2.add(strArr3[i]);
                    i++;
                }
            }
            throw null;
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr2[2])[0];
        int i36 = ((int[]) objArr2[3])[0];
        int i37 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int i38 = ~(((int) Process.getStartElapsedRealtime()) | 340349222);
        int i39 = i35 + (((-300987547) | i38) * (-658)) + 1851316721 + ((i38 | (-368702911)) * 658);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr31[2])[0] = i41 ^ (i41 << 5);
        return null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
            int i5 = $10 + 3;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 1235, 35 - (ViewConfiguration.getJumpTapTimeout() >> 16), -653973969, false, $$i(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2764 - TextUtils.getOffsetAfter("", 0), 14 - (ViewConfiguration.getPressedStateDuration() >> 16), 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Gravity.getAbsoluteGravity(0, 0)), Color.green(0) + 253, 22 - Color.red(0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 65200);
                    int iCombineMeasuredStates = 2891 - View.combineMeasuredStates(0, 0);
                    int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16;
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    String str$$i = $$i(b5, b6, (byte) (b6 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iCombineMeasuredStates, i7, 2012627446, false, str$$i, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i8 = $10 + 97;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i3 = i2;
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1478975944;
        int i5 = ~iCodePointAt;
        if (i4 != 1675166332 + (((~(1789801501 | i5)) | (~((-959813959) | iCodePointAt))) * 210) + (((~(iCodePointAt | 2076163423)) | (~(i5 | (-673452037)))) * 210)) {
            throw new RuntimeException("-2086835459");
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        if (i6 != (-778344900) + (((-1434728539) | i7) * 376) + (((~((~i7) | 865767105)) | (-2006892252)) * (-376)) + (((~(i7 | (-865767106))) | 1713288859) * 376)) {
            throw null;
        }
        super.onResume();
        int i8 = asInterface + 81;
        d = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 69 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-2016000544) + ((iIdentityHashCode | 536871200) * 988);
            int i5 = ~iIdentityHashCode;
            if (i3 != i4 + (((~(784438050 | i5)) | (-1861992444)) * (-1976)) + (((~(iIdentityHashCode | 1614425593)) | 536871200 | (~((-1614425594) | i5))) * 988)) {
                throw null;
            }
        } else {
            int i6 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_get_bank_point).substring(1, 2).codePointAt(0) - 1043472015;
            int i7 = 1338394684 + (((-1988664106) | iCodePointAt) * 614);
            int i8 = ~iCodePointAt;
            if (i6 != i7 + (((~((-730464444) | i8)) | 151126162 | (~((-1560451987) | i8))) * (-1228)) + (((~(i8 | (-1409325825))) | (~((-579338282) | i8))) * 614)) {
                throw null;
            }
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i11 = (-1091765548) + (((~((-606392701) | i10)) | 2129948 | (~(1972663264 | i10))) * (-754));
        int i12 = ~((-2129949) | i10);
        int i13 = ~i10;
        if (i9 != i11 + ((i12 | (~(1974793212 | i13))) * (-754)) + ((i13 | (-606392701)) * 754)) {
            int i14 = 279233608 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i15 = d + 91;
        asInterface = i15 % 128;
        int i16 = i15 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationStatusActivity registrationStatusActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "register_account_new_user"));
        Intrinsics.checkNotNullParameter(registrationStatusActivity, "");
        Intrinsics.checkNotNullParameter("register_account_new_user", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("register_account_new_user", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("register_account_new_user", mapMutableMapOf);
        ChooseMembershipActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ChooseMembershipActivity.INSTANCE;
        ChooseMembershipActivity.Companion.TuitionPaymentFragmentbindingInflater1(registrationStatusActivity, RegistrationStatus.UNREGISTERED, (RegisteredMemberRegistration) registrationStatusActivity.b.getValue());
        Unit unit = Unit.INSTANCE;
        int i2 = d + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(RegistrationStatusActivity registrationStatusActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "register_account_already_registered"));
        Intrinsics.checkNotNullParameter(registrationStatusActivity, "");
        Intrinsics.checkNotNullParameter("register_account_already_registered", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("register_account_already_registered", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("register_account_already_registered", mapMutableMapOf);
        ChooseMembershipActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ChooseMembershipActivity.INSTANCE;
        ChooseMembershipActivity.Companion.TuitionPaymentFragmentbindingInflater1(registrationStatusActivity, RegistrationStatus.REGISTERED, (RegisteredMemberRegistration) registrationStatusActivity.b.getValue());
        Unit unit = Unit.INSTANCE;
        int i2 = d + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RegisteredMemberRegistration b(RegistrationStatusActivity registrationStatusActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = registrationStatusActivity.getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            throw null;
        }
        Parcelable parcelableExtra2 = registrationStatusActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra2);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra2;
        int i3 = d + 67;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return registeredMemberRegistration;
    }

    static {
        g = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f547a + 25;
        g = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getMeteringRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-635459230, zzir.TuitionPaymentFragmentbindingInflater1(), getMeteringRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 635459231, zzir.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getMeteringRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1724505410, 1192516839 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, zzir.TuitionPaymentFragmentbindingInflater1(), -1724505408, getMeteringRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1355009850, zzir.TuitionPaymentFragmentbindingInflater1(), (-1978322907) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 1355009850, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 394203997, new Object[]{this, context}, zzir.TuitionPaymentFragmentbindingInflater1());
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4432275442311612980L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        asBinder = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, short r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.RegistrationStatusActivity.$$c
            int r5 = r5 + 4
            int r7 = 104 - r7
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r7 = r5
            r3 = r6
            goto L27
        L12:
            r4 = r7
            r7 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            int r7 = r7 + 1
            r0[r2] = r3
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L25:
            r3 = r1[r7]
        L27:
            int r5 = r5 + r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationStatusActivity.$$i(short, short, byte):java.lang.String");
    }
}
