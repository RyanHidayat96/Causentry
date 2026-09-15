package com.bpjstku.presentation.partner;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPartnerFilterBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.partner.PartnerFilterActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.messaging.FcmLifecycleCallbacks$$ExternalSyntheticLambda0;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.TrustedWebActivityService1;
import defpackage.VideoEncoderSession1;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.appendBackupVideoProfile;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.canPositionSelectorForHoveredItem;
import defpackage.createServiceIntent;
import defpackage.dumpAudioCapabilities;
import defpackage.finalizeWithError;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isBound;
import defpackage.isSamsungJ2;
import defpackage.mapPoint;
import defpackage.share;
import defpackage.suspend;
import defpackage.wrapCallback;
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
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0016\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u001a8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/partner/PartnerFilterActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityPartnerFilterBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentbindingInflater1", "LcanPositionSelectorForHoveredItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PartnerFilterActivity extends BindingReactiveFormActivity<ActivityPartnerFilterBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f575a;
    private static byte[] asBinder;
    private static int asInterface;
    private static short[] d;
    private static int g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_partner_filter;
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$f = ModuleDescriptor.MODULE_VERSION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {97, 58, 103, -72, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -28, 13, -14, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$n = 233;
    private static final byte[] $$a = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 202;
    private static int notify = 1;
    private static int INotificationSideChannel = 0;
    private static int cancelAll = 1;

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2073450791
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r7, int r8, int r9, int r10, java.lang.Object[] r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, int, int, int, java.lang.Object[], int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.partner.PartnerFilterActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r3 = -r3
            int r8 = r8 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerFilterActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.partner.PartnerFilterActivity.$$m
            int r7 = r7 * 3
            int r1 = 53 - r7
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerFilterActivity.f(short, short, int, java.lang.Object[]):void");
    }

    public PartnerFilterActivity() {
        final PartnerFilterActivity partnerFilterActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<canPositionSelectorForHoveredItem>() { // from class: com.bpjstku.presentation.partner.PartnerFilterActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [canPositionSelectorForHoveredItem, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final canPositionSelectorForHoveredItem invoke() {
                ComponentCallbacks componentCallbacks = partnerFilterActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(canPositionSelectorForHoveredItem.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.partner.PartnerFilterActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/partner/PartnerFilterActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/app/Activity;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivityForResult(new Intent(p0, (Class<?>) PartnerFilterActivity.class), 597);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 89;
        cancelAll = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i2 + 23;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityPartnerFilterBinding> TuitionPaymentFragmentbindingInflater1() {
        PartnerFilterActivity$bindingInflater$1 partnerFilterActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = cancelAll + 101;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            partnerFilterActivity$bindingInflater$1 = PartnerFilterActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = 68 / 0;
        } else {
            partnerFilterActivity$bindingInflater$1 = PartnerFilterActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i4 = cancelAll + 27;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return partnerFilterActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancelAll + 25;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        PartnerFilterActivity partnerFilterActivity = this;
        Intrinsics.checkNotNullParameter(partnerFilterActivity, "");
        partnerFilterActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_partner_filter));
        MaterialButton materialButton = INotificationSideChannelStub().btnApply;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = cancelAll + 79;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f575a)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int fadingEdgeLength = 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iRed = 33 - Color.red(0);
                byte b2 = (byte) ($$c[1] - 1);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, fadingEdgeLength, iRed, 1387473586, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11;
                int i7 = i6 + 39;
                $10 = i7 % 128;
                i4 = i7 % 2 != 0 ? 0 : 1;
                int i8 = i6 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                i4 = 0;
            }
            long j2 = 0;
            if (i4 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr2 = asBinder;
                if (bArr2 != null) {
                    int i10 = $10 + 23;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                int i12 = 3358 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
                                int trimmedLength = 18 - TextUtils.getTrimmedLength("");
                                byte length2 = (byte) $$c.length;
                                byte b4 = (byte) (length2 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, i12, trimmedLength, -1054011043, false, $$i(length2, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i11++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = asBinder;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(g)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
                            int packedPositionType = 33 - ExpandableListView.getPackedPositionType(0L);
                            byte b5 = (byte) ($$c[1] - 1);
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, tapTimeout, packedPositionType, 1387473586, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) f575a) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) d[i3 + ((int) (((long) g) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f575a) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) g) ^ j)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (55904 - ExpandableListView.getPackedPositionGroup(0L));
                    int iResolveSizeAndState = 2855 - View.resolveSizeAndState(0, 0, 0);
                    int iBlue = Color.blue(0) + 13;
                    byte b7 = $$c[1];
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, iResolveSizeAndState, iBlue, -1529949196, false, $$i(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i13 = 0; i13 < length3; i13++) {
                        int i14 = $11 + 13;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i16 = $11 + 121;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = asBinder;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = d;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x03d4  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
            int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iIndexOf = 28 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) 52, bArr[7], bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iLastIndexOf, iIndexOf, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1128539560, (-55) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_ecash).substring(0, 32).length() - 57), (byte) ((-108) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_secondary_cta_text).substring(0, 8).codePointAt(0) - 584670626, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e((-1128539520) - Color.blue(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gopay_transaction).substring(0, 6).codePointAt(2) - 158, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).length() + 68), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 114), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 584670575, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
            int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0');
            int iAlpha = Color.alpha(0) + 28;
            byte b = $$a[7];
            short s = b;
            Object[] objArr6 = new Object[1];
            c(b, s, (byte) s, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, iIndexOf2, iAlpha, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                int packedPositionGroup2 = 28 - ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr7 = new Object[1];
                c((byte) 15, (short) 52, $$a[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, modifierMetaStateMask, packedPositionGroup2, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr8[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{i2}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~((-42082392) | (~iIdentityHashCode));
            int i4 = (((((1698434560 | i3) | (~(42082391 | iIdentityHashCode))) * (-338)) + 319343259) + (((~(iIdentityHashCode | 1740516951)) | i3) * 338)) - 155714469;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e((-1128539524) - (ViewConfiguration.getLongPressTimeout() >> 16), (-49) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 149), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 17), (-584670525) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1128539533, (-58) - Color.green(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 105), (byte) (11 - (Process.myPid() >> 22)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 584670536, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i7 = INotificationSideChannel + 47;
                int i8 = i7 % 128;
                cancelAll = i8;
                int i9 = i7 % 2;
                if (baseContext instanceof ContextWrapper) {
                    int i10 = i8 + 87;
                    INotificationSideChannel = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            e(TextUtils.lastIndexOf("", '0', 0) - 1128539514, ((Process.getThreadPriority(0) + 20) >> 6) - 60, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 135), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).codePointAt(3) - 83), TextUtils.getOffsetAfter("", 0) - 584670483, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1128539552, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 169, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).codePointAt(0) - 115), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 198), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 584670567, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i12 = INotificationSideChannel + 79;
            cancelAll = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr13 = {baseContext, Integer.valueOf(iIntValue), 0, -155714469};
                byte[] bArr2 = $$m;
                byte b2 = bArr2[35];
                byte b3 = (byte) (-b2);
                Object[] objArr14 = new Object[1];
                f(b2, b3, b3, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b4 = bArr2[14];
                byte b5 = (byte) (bArr2[35] + 1);
                Object[] objArr15 = new Object[1];
                f(b4, b5, b5, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                    int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
                    int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                    Object[] objArr16 = new Object[1];
                    c((byte) 15, (short) 52, $$a[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, bitsPerPixel, iCombineMeasuredStates, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1128539535, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 165, (short) ((-25) - TextUtils.getOffsetBefore("", 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 145), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 584670596, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1128539629, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 97, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 23), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_format_valid_until).substring(3, 4).length() - 104), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 584670575, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                        int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b6 = $$a[7];
                        short s2 = b6;
                        Object[] objArr19 = new Object[1];
                        c(b6, s2, (byte) s2, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, scrollDefaultDelay, iLastIndexOf2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int i14 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, bArr3[7], bArr3[5], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, i14, i15, -1048449946, false, (String) objArr20[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i19}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = ~((-838885537) | iIdentityHashCode2);
            int i21 = ~iIdentityHashCode2;
            int i22 = i18 + 839076432 + ((i20 | (~((-1641554) | i21))) * 497) + (((~(iIdentityHashCode2 | (-1641554))) | (~((-933552555) | i21)) | 94667018) * 497);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i25 = 0;
                while (i25 < strArr.length) {
                    int i26 = cancelAll + 107;
                    INotificationSideChannel = i26 % 128;
                    if (i26 % 2 != 0) {
                        arrayList.add(strArr[i25]);
                        i25 += 103;
                    } else {
                        arrayList.add(strArr[i25]);
                        i25++;
                    }
                }
            }
            int[] iArr = new int[i17];
            int i27 = i17 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i29}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i30 = i28 + (-398041160) + (((~((-59770112) | iIdentityHashCode3)) | 33554588) * 345) + (((~((-59770112) | (~iIdentityHashCode3))) | 1680754944) * 345) + ((~(iIdentityHashCode3 | (-33554589))) * 345);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[0])[0] = i32 ^ (i32 << 5);
        }
        ActivityPartnerFilterBinding activityPartnerFilterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityPartnerFilterBindingINotificationSideChannelStub.tilProvince.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: TrustedWebActivityServiceConnectionCancelNotificationArgs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException {
                    PartnerFilterActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        EditText editText2 = activityPartnerFilterBindingINotificationSideChannelStub.tilCity.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: TrustedWebActivityServiceConnectionActiveNotificationsArgs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PartnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        MaterialButton materialButton = activityPartnerFilterBindingINotificationSideChannelStub.btnApply;
        int i33 = ((int[]) objArr2[0])[0];
        int i34 = i33 * i33;
        int i35 = -(1282086466 * i33);
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = -(i33 * 2113615066);
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        int i39 = ((i38 | 135682756) << 1) - (135682756 ^ i38);
        int i40 = i39 >> 19;
        int i41 = ((i40 & (-16383)) + (i40 | (-16383))) / 8192;
        int i42 = ((i41 | 1) << 1) - (i41 ^ 1);
        int i43 = (-(((((i39 >> 21) - 4095) / 2048) + 1) ^ ((i39 & i42) + (i42 | i39)))) + 8;
        int i44 = i43 >> 23;
        int i45 = ((i44 ^ (-1023)) + ((i44 & (-1023)) << 1)) / 512;
        int i46 = (i45 ^ 1) + ((i45 & 1) << 1);
        Intrinsics.checkNotNullExpressionValue(materialButton, "19|16|btnApply".substring(72624 / ((i43 & (-(((i46 | 1) << 1) - (i46 ^ 1)))) * 1513)));
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: sendExtraCommand
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnerFilterActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = cancelAll + 45;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        CodeNamePair codeNamePairB = ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.b();
        if (codeNamePairB != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePairB;
        }
        CodeNamePair codeNamePairTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (codeNamePairTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePairTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            TextInputEditText textInputEditText = INotificationSideChannelStub().edtProvince;
            CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = null;
            if (codeNamePair != null) {
                int i4 = cancelAll + 121;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                str = codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
            textInputEditText.setText(str);
            TextInputEditText textInputEditText2 = INotificationSideChannelStub().edtCity;
            CodeNamePair codeNamePair2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (codeNamePair2 != null) {
                int i6 = cancelAll + 123;
                INotificationSideChannel = i6 % 128;
                if (i6 % 2 != 0) {
                    String str3 = codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    str2.hashCode();
                    throw null;
                }
                str2 = codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            textInputEditText2.setText(str2);
        }
        int i7 = cancelAll + 65;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 71;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = cancelAll + 115;
                INotificationSideChannel = i4 % 128;
                if (i4 % 2 != 0) {
                    onBackPressed();
                    throw null;
                }
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 23;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnApply;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = cancelAll + 31;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancelAll + 79;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnApply;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = INotificationSideChannel + 43;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) (29944 - View.MeasureSpec.getMode(0));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
            int i3 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c((byte) 15, (short) 52, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iMakeMeasureSpec, i3, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                byte b = $$a[7];
                short s = b;
                Object[] objArr3 = new Object[1];
                c(b, s, (byte) s, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, iIndexOf, iKeyCodeFromString, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr4[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((((-144688828) + (((~((-106173399) | i5)) | (~((-106429028) | i5))) * (-867))) + ((((~((-106173399) | iIdentityHashCode)) | 106172994) | (~((-106429028) | iIdentityHashCode))) * (-1734))) + (((~(iIdentityHashCode | (-256034))) | ((~(i5 | (-106172995))) | (~((-405) | iIdentityHashCode)))) * 867)) - 1091605365;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i8 ^ (i8 << 5);
            int i9 = cancelAll + 39;
            INotificationSideChannel = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step3).substring(0, 1).length() - 1128539516, Color.green(0) - 60, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 100), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 72), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 584670494, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).length() - 1128539517, View.getDefaultSize(0, 0) - 60, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).length() - 19), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) - 91), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_atm_bersama).substring(1, 2).codePointAt(0) - 584670573, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {979219895};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.red(0) + 42049), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1725, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1091605365);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                    int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                    byte b2 = $$a[7];
                    short s2 = b2;
                    Object[] objArr8 = new Object[1];
                    c(b2, s2, (byte) s2, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, packedPositionType, offsetBefore, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1128539631, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).length() - 56, (short) ((-25) - TextUtils.getOffsetAfter("", 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 120), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 584670596, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e((-1128539520) - View.getDefaultSize(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_empty_expiry_date).substring(9, 10).codePointAt(0) - 177, (short) (69 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 201), (-584670539) - Color.red(0), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                        int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr11 = new Object[1];
                        c(b4, (short) (b4 | 89), b3, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, fadingEdgeLength, keyRepeatDelay, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
                        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, (short) 52, $$a[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSizeAndState, i11, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i12 = ((int[]) objArrB$5f1425da[3])[0];
        int i13 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i13}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i14 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i15 = i12 + (-1593533320) + (((~(294155227 | i14)) | (-506757654)) * (-983)) + (((~(i14 | (-506757654))) | 268435985) * 983);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
            int absoluteGravity2 = 15 - Gravity.getAbsoluteGravity(0, 0);
            byte b5 = $$a[7];
            byte b6 = b5;
            Object[] objArr14 = new Object[1];
            c(b6, (short) (b6 | 141), b5, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, edgeSlop, absoluteGravity2, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1128539524, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 90, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 71), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step3).substring(0, 1).length() - 110), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 584670559, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_phone_no_invalid_optional).substring(28, 30).codePointAt(0) - 1128539618, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_method_empty).substring(5, 7).length() - 63, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_shopeepay_deeplink).substring(1, 3).codePointAt(1) - 52), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 114), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step2).substring(1, 2).codePointAt(0) - 584670636, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b7 = $$a[7];
            short s3 = b7;
            Object[] objArr17 = new Object[1];
            c(b7, s3, (byte) s3, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, scrollDefaultDelay, iIndexOf2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
                byte[] bArr = $$a;
                Object[] objArr18 = new Object[1];
                c((byte) 52, bArr[7], bArr[5], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, offsetAfter, iLastIndexOf, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr19[3])[0];
            int i19 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i21 = (((2008690884 + ((~(467382207 | i20)) * 623)) + (((~i20) | 155910677) * (-623))) + (((~(i20 | 433786527)) | ((~(189506357 | i20)) | (-467382208))) * 623)) - 1912515857;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr[2])[0] = i23 ^ (i23 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1128539551, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_6).substring(3, 4).codePointAt(0) - 177, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gb_t_ev_connector_type).substring(0, 4).length() - 103), (byte) ((-36) - View.resolveSizeAndState(0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step6).substring(0, 1).codePointAt(0) - 584670563, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_successful).substring(0, 1).length() - 1128539517, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_cards).substring(1, 2).length() - 61, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_company_code).substring(1, 2).length() - 93), (-584670468) - TextUtils.getOffsetBefore("", 0), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {979219895};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.argb(0, 0, 0, 0) + 1134, TextUtils.indexOf((CharSequence) "", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1912515857, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c4 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                int i24 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                byte b8 = $$a[7];
                byte b9 = b8;
                Object[] objArr24 = new Object[1];
                c(b9, (short) (b9 | 141), b8, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c4, packedPositionChild, i24, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "") + 45993), TextUtils.getCapsMode("", 0, 0) + 1117, 17 - (ViewConfiguration.getPressedStateDuration() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int edgeSlop2 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                byte[] bArr2 = $$a;
                Object[] objArr25 = new Object[1];
                c((byte) 52, bArr2[7], bArr2[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar, edgeSlop2, iCombineMeasuredStates, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e((-1128539523) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 90, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 137), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 145), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 584670606, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1128539556, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_2).substring(5, 6).length() - 62, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 33), (byte) ((-103) - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 584670539, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b10 = $$a[7];
                    short s4 = b10;
                    Object[] objArr28 = new Object[1];
                    c(b10, s4, (byte) s4, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAxisFromString, doubleTapTimeout, modifierMetaStateMask, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cRed = (char) Color.red(0);
                    int iRed = 1031 - Color.red(0);
                    int i25 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b11 = $$a[7];
                    byte b12 = b11;
                    Object[] objArr29 = new Object[1];
                    c(b12, (short) (b12 | 141), b11, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRed, iRed, i25, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i29 = ~new Random().nextInt();
            int i30 = i26 + 848748841 + (((~(i29 | 1014671042)) | 25237784) * (-160)) + (((~(i29 | 770390872)) | 1014671042) * 160);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr30[2])[0] = i32 ^ (i32 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i33 = cancelAll + 51;
        INotificationSideChannel = i33 % 128;
        int i34 = i33 % 2;
        while (i2 < strArr4.length) {
            arrayList2.add(strArr4[i2]);
            i2++;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancelAll + 39;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int i6 = ~i5;
        if (i4 != 436818192 + (((~((-12846329) | i6)) | (-842833872)) * 519) + (((~(i6 | (-263369))) | (~((-842570504) | i5))) * (-519)) + (((~(i5 | (-842833872))) | 12846328) * 519)) {
            int i7 = 920350288 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        if (i8 != ((((~((-1850896228) | i9)) | 1161083546) * 398) - 1229114954) + (((~((~i9) | (-1850896228))) | 1161083546) * 398)) {
            throw null;
        }
        super.onResume();
        int i10 = cancelAll + 27;
        INotificationSideChannel = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PartnerFilterActivity partnerFilterActivity, CodeNamePair codeNamePair) {
        Unit unit;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 55;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        if (i3 == 0) {
            partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
            partnerFilterActivity.INotificationSideChannelStub().edtCity.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            unit = Unit.INSTANCE;
            int i4 = 80 / 0;
        } else {
            partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
            partnerFilterActivity.INotificationSideChannelStub().edtCity.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            unit = Unit.INSTANCE;
        }
        int i5 = cancelAll + 89;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final PartnerFilterActivity partnerFilterActivity = (PartnerFilterActivity) objArr[0];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[1]);
        try {
            partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            createServiceIntent.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = createServiceIntent.INSTANCE;
            createServiceIntent createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createServiceIntent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((canPositionSelectorForHoveredItem) partnerFilterActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Function1() { // from class: TrustedWebActivityServiceConnectionNotifyNotificationArgs
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PartnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (CodeNamePair) obj);
                }
            });
            FragmentManager supportFragmentManager = partnerFilterActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = INotificationSideChannel + 101;
                cancelAll = i2 % 128;
                if (i2 % 2 == 0) {
                    createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i3 = 69 / 0;
                } else {
                    createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
            int i4 = INotificationSideChannel + 99;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PartnerFilterActivity partnerFilterActivity, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        int i2 = cancelAll + 109;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        ActivityPartnerFilterBinding activityPartnerFilterBindingINotificationSideChannelStub = partnerFilterActivity.INotificationSideChannelStub();
        partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        activityPartnerFilterBindingINotificationSideChannelStub.edtProvince.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        TextInputEditText textInputEditText = activityPartnerFilterBindingINotificationSideChannelStub.edtCity;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        TextInputEditText textInputEditText2 = textInputEditText;
        Intrinsics.checkNotNullParameter(textInputEditText2, "");
        textInputEditText2.setText("");
        activityPartnerFilterBindingINotificationSideChannelStub.tilCity.setErrorEnabled(false);
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 43;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PartnerFilterActivity partnerFilterActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_search_partner_health_care", "search_partner_health_care"));
        Intrinsics.checkNotNullParameter(partnerFilterActivity, "");
        Intrinsics.checkNotNullParameter("search_partner_health_care", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("search_partner_health_care", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("search_partner_health_care", mapMutableMapOf);
        if (partnerFilterActivity.RemoteActionCompatParcelizer()) {
            Intent intent = new Intent();
            intent.putExtra("key_province_partner", partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            intent.putExtra("key_city_partner", partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            partnerFilterActivity.setResult(-1, intent);
            CodeNamePair codeNamePair = partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (codeNamePair != null) {
                canPositionSelectorForHoveredItem canpositionselectorforhovereditem = (canPositionSelectorForHoveredItem) partnerFilterActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Intrinsics.checkNotNullParameter(codeNamePair, "");
                VideoEncoderSession1 videoEncoderSession1B = canpositionselectorforhovereditem.TuitionPaymentFragmentbindingInflater1.b(codeNamePair);
                appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
                Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileB, "");
                appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
                Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1, "");
                BufferProviderState bufferProviderStateB = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(((finalizeWithError) share.b(new suspend(appendbackupvideoprofileB, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1), "transformer is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoEncoderSession1B)).b();
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateB, "");
                canpositionselectorforhovereditem.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateB);
                int i2 = INotificationSideChannel + 69;
                cancelAll = i2 % 128;
                int i3 = i2 % 2;
            }
            CodeNamePair codeNamePair2 = partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (codeNamePair2 != null) {
                canPositionSelectorForHoveredItem canpositionselectorforhovereditem2 = (canPositionSelectorForHoveredItem) partnerFilterActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Intrinsics.checkNotNullParameter(codeNamePair2, "");
                VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = canpositionselectorforhovereditem2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(codeNamePair2);
                appendBackupVideoProfile appendbackupvideoprofileB2 = isSamsungJ2.b();
                Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileB2, "");
                appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater2 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
                Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater2, "");
                BufferProviderState bufferProviderStateB2 = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(((finalizeWithError) share.b(new suspend(appendbackupvideoprofileB2, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater2), "transformer is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoEncoderSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2)).b();
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateB2, "");
                canpositionselectorforhovereditem2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateB2);
            }
            partnerFilterActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PartnerFilterActivity partnerFilterActivity, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 49;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                TrustedWebActivityService1.Companion tuitionPaymentFragmentbindingInflater1 = TrustedWebActivityService1.INSTANCE;
                TrustedWebActivityService1 trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TrustedWebActivityService1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((canPositionSelectorForHoveredItem) partnerFilterActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.b(), partnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new wrapCallback(partnerFilterActivity));
                FragmentManager supportFragmentManager = partnerFilterActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = cancelAll + 75;
                    INotificationSideChannel = i4 % 128;
                    int i5 = i4 % 2;
                    trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i6 = cancelAll + 17;
                    INotificationSideChannel = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void b(PartnerFilterActivity partnerFilterActivity, View view) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = com.google.firebase.installations.interop.R.style.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = com.google.firebase.installations.interop.R.style.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1711055507, com.google.firebase.installations.interop.R.style.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, iTuitionPaymentFragmentbindingInflater1, new Object[]{partnerFilterActivity, view}, com.google.firebase.installations.interop.R.style.TuitionPaymentFragmentbindingInflater1(), 1711055508);
    }

    static {
        onTransact = 0;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 49;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 53;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() throws IllegalAccessException {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_address).substring(0, 6).length() - 165807255;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2090206913, FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), length, new Object[]{this}, FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2090206916);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(587689524, FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this, bundle}, com.google.firebase.installations.interop.R.style.TuitionPaymentFragmentbindingInflater1(), -587689522);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int length = (-1002323341) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_primary_cta_text).substring(5, 14).length();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).codePointAt(4) + 756555039;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1600797309, FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iCodePointAt, length, new Object[]{this}, FcmLifecycleCallbacks$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1600797309);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 89;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 19;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        g = -1368129146;
        f575a = -1934795606;
        asInterface = -806782717;
        asBinder = new byte[]{82, 102, 79, 53, -72, 82, -99, 77, 100, 40, 41, -89, 86, 13, -108, 103, 100, 97, 80, -104, 81, -6, -66, -63, -86, -85, -58, -93, -44, -57, -64, -77, -73, -63, -65, 101, -72, -75, 106, -112, -35, 99, 109, -75, 107, -77, -105, 66, -107, -58, 100, 105, 117, -86, -67, -70, -69, 118, -66, 107, -33, -76, -91, -69, -36, -48, -35, -38, -74, -113, -19, -76, -95, -37, -74, -35, -72, -47, 118, -90, 111, -69, -70, -104, 110, -46, 106, -93, -110, 124, -54, 104, 81, -123, 124, 119, -123, 46, 41, -101, 85, 39, -123, 82, 89, 81, -105, -26, -26, -26, -26, -26, -26};
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
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r6 = r6 + 117
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = com.bpjstku.presentation.partner.PartnerFilterActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerFilterActivity.$$i(short, short, short):java.lang.String");
    }
}
