package com.bpjstku.presentation.membership.devicebinding;

import android.content.Context;
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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityDeviceUnlinkingEmailBinding;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingEmailActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$1;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.onScroll;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011R\u0015\u0010\u0007\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0017\u0010\f\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0014"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingEmailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDeviceUnlinkingEmailBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Lkotlin/Lazy;", "d", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUnlinkingEmailActivity extends BindingBaseActivity<ActivityDeviceUnlinkingEmailBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f513a;
    private static char asInterface;
    private static char d;
    private static char g;
    private static final byte[] $$c = {117, 57, 101, -72};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {87, -91, 60, 112, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 131;
    private static int onTransact = 0;
    private static int cancel = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: AppCompatProgressBarHelperApi23Impl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingEmailActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: tileify
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: tileifyIndeterminate
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: AppCompatRadioButton
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: AppCompatReceiveContentHelper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingEmailActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1384762634
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int r7, int r8, int r9, int r10, int r11, int r12, java.lang.Object[] r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(int, int, int, int, int, int, java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 145 - r8
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingEmailActivity.$$a
            int r7 = r7 + 1
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingEmailActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDeviceUnlinkingEmailBinding> TuitionPaymentFragmentbindingInflater1() {
        DeviceUnlinkingEmailActivity$bindingInflater$1 deviceUnlinkingEmailActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = cancelAll + 93;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            deviceUnlinkingEmailActivity$bindingInflater$1 = DeviceUnlinkingEmailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 38 / 0;
        } else {
            deviceUnlinkingEmailActivity$bindingInflater$1 = DeviceUnlinkingEmailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i4 = cancel + 19;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return deviceUnlinkingEmailActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity = (DeviceUnlinkingEmailActivity) objArr[0];
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityDeviceUnlinkingEmailBinding) ((ViewBinding) deviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnContinue;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: transferLayerProperties
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = cancel + 43;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancelAll + 111;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity = this;
        Intrinsics.checkNotNullParameter(deviceUnlinkingEmailActivity, "");
        deviceUnlinkingEmailActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityDeviceUnlinkingEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        ((ActivityDeviceUnlinkingEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtEmail.setText((String) this.b.getValue());
        ((ActivityDeviceUnlinkingEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtEmail.setEnabled(false);
        ((ActivityDeviceUnlinkingEmailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilEmail.setEnabled(false);
        int i4 = cancel + 123;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                int i10 = $10 + 125;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) g) ^ 8611973335120459638L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f513a);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char doubleTapTimeout = (char) (47773 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 467;
                        int iGreen = Color.green(i5) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, i14, iGreen, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i15 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) d) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (KeyEvent.getMaxKeyCode() >> 16)), Color.red(0) + 468, (ViewConfiguration.getTapTimeout() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i15 + 1;
                    i5 = 0;
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
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), 2323 - ExpandableListView.getPackedPositionType(0L), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int offsetAfter = 1031 - TextUtils.getOffsetAfter("", 0);
            int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c(b, (byte) (b | 52), (short) 141, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, offsetAfter, iCombineMeasuredStates, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{46377, 10657, 3786, 52172, 53030, 42368, 2406, 5325, 43277, 49889, 37007, 19523, 15466, 1149, 63401, 52117, 60057, 11350, 58448, 42269, 42017, 37964, 44364, 52907}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_right_eye_closed).substring(0, 15).length() + 7, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{38406, 46467, 31801, 25258, 5582, 46958, 43517, 45629, 20948, 58098, 64450, 54229, 3540, 17208, 38169, 62746, 6493, 2801}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i2 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i3 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b2 = $$a[7];
            Object[] objArr6 = new Object[1];
            c(b2, (byte) (b2 | 52), (short) 89, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, i2, i3, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = cancelAll + 21;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr = $$a;
                byte b3 = bArr[132];
                byte b4 = bArr[7];
                Object[] objArr7 = new Object[1];
                c(b3, b4, (short) (b4 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, packedPositionChild, packedPositionType, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i9 = ~i8;
            int i10 = 915893145 + ((i8 | (-12207369)) * 140) + (((~((-12207369) | i9)) | 524288) * (-280)) + (((~(i8 | (-524289))) | (~(256487538 | i9)) | (-268170619)) * 140) + 1526792384;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{27537, 53380, 36801, 14406, 2006, 49946, 9775, 60830, 20591, 64632, 38331, 29762, 827, 47007, 32327, 60784, 9958, 36047}, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{57616, 35393, 22743, 18751, 62208, 44522, 58281, 54830, 44174, 36146, 4203, 30242, 38370, 6727, 33861, 15463, 39932, 9242}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {671204132};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - KeyEvent.keyCodeFromString("")), 1134 - Drawable.resolveOpacity(0, 0), 17 - TextUtils.lastIndexOf("", '0'), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1526792384, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 15;
                    byte b5 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c(b5, (byte) (b5 | 52), (short) 141, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, packedPositionGroup, iIndexOf, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 45993), 1117 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int i13 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[132];
                    byte b7 = bArr2[7];
                    Object[] objArr14 = new Object[1];
                    c(b6, b7, (short) (b7 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf2, i13, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{46377, 10657, 3786, 52172, 53030, 42368, 2406, 5325, 43277, 49889, 37007, 19523, 15466, 1149, 63401, 52117, 60057, 11350, 58448, 42269, 42017, 37964, 44364, 52907}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 76, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{38406, 46467, 31801, 25258, 5582, 46958, 43517, 45629, 20948, 58098, 64450, 54229, 3540, 17208, 38169, 62746, 6493, 2801}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_image_captured_failed).substring(6, 7).length() + 14, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iGreen = Color.green(0) + 1031;
                        int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b8 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(b8, (byte) (b8 | 52), (short) 89, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay, iGreen, keyRepeatTimeout, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int i14 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                        int scrollDefaultDelay2 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b9 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        c(b9, (byte) (b9 | 52), (short) 141, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollBarSize, i14, scrollDefaultDelay2, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i15 = cancelAll + 93;
                    cancel = i15 % 128;
                    int i16 = i15 % 2;
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
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i22 = ~(System.identityHashCode(this) | 9500761);
            int i23 = i19 + (((34889 | i22) * (-196)) - 1604192499) + ((i22 | 9465872) * 196);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i26 = cancel + 63;
                cancelAll = i26 % 128;
                for (int i27 = i26 % 2 == 0 ? 1 : 0; i27 < strArr3.length; i27++) {
                    arrayList.add(strArr3[i27]);
                }
            }
            int[] iArr = new int[i18];
            int i28 = i18 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i28) % 2) - 1], 1).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[3])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_sample_valid_date).substring(0, 6).codePointAt(5) - 475977700;
            int i32 = ~iCodePointAt;
            int i33 = i29 + (-879372655) + (((~((-627864154) | i32)) | 560484417) * 184) + ((iCodePointAt | (-939524060)) * (-184)) + ((~((-872144324) | i32)) * 184);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr20[2])[0] = i35 ^ (i35 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
            int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 1755;
            int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b10 = $$a[7];
            byte b11 = (byte) (b10 | 37);
            Object[] objArr21 = new Object[1];
            c(b10, b11, b11, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity, iIndexOf3, keyRepeatDelay, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                byte b12 = $$a[7];
                Object[] objArr22 = new Object[1];
                c(b12, (byte) (b12 | 52), (short) 89, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, iResolveOpacity, keyRepeatTimeout2, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i36 = ~iElapsedRealtime;
            int i37 = ((1599082300 + ((((~(i36 | (-263887508))) | 60297746) | (~((-272900173) | iElapsedRealtime))) * 717)) + (((~(iElapsedRealtime | (-263887508))) | ((~(i36 | (-272900173))) | 60297746)) * 717)) - 1593258480;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr2[3])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new char[]{27537, 53380, 36801, 14406, 2006, 49946, 9775, 60830, 20591, 64632, 38331, 29762, 827, 47007, 32327, 60784, 9958, 36047}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_6).substring(3, 4).length() + 15, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new char[]{57616, 35393, 22743, 18751, 62208, 44522, 58281, 54830, 44174, 36146, 4203, 30242, 38370, 6727, 33861, 15463, 39932, 9242}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {671204132};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42048), ((Process.getThreadPriority(0) + 20) >> 6) + 1726, 28 - ExpandableListView.getPackedPositionChild(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -1593258480, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b13 = $$a[7];
                Object[] objArr27 = new Object[1];
                c(b13, (byte) (b13 | 52), (short) 89, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveOpacity, iNormalizeMetaState, iMakeMeasureSpec, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{46377, 10657, 3786, 52172, 53030, 42368, 2406, 5325, 43277, 49889, 37007, 19523, 15466, 1149, 63401, 52117, 60057, 11350, 58448, 42269, 42017, 37964, 44364, 52907}, 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{38406, 46467, 31801, 25258, 5582, 46958, 43517, 45629, 20948, 58098, 64450, 54229, 3540, 17208, 38169, 62746, 6493, 2801}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr30 = new Object[1];
                    c(b15, (byte) (b15 | 52), b14, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, maximumDrawingCacheSize, iLastIndexOf, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int iIndexOf4 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b16 = $$a[7];
                    byte b17 = (byte) (b16 | 37);
                    Object[] objArr31 = new Object[1];
                    c(b16, b17, b17, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, mirror, iIndexOf4, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrB$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArr2[1])[0];
        int i41 = ((int[]) objArr2[0])[0];
        if (i41 != i40) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[4];
            if (strArr5 != null) {
                int i42 = cancelAll + 109;
                cancel = i42 % 128;
                int i43 = i42 % 2;
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i41));
        }
        int i44 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i45 = ~(System.identityHashCode(this) | 469275357);
        int i46 = i44 + (((-347346559) | i45) * (-658)) + 218520011 + ((i45 | (-536647424)) * 658);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[3])[0] = i48 ^ (i48 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 81;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = ~elapsedCpuTime;
            if (i3 != (-1599950198) + (((~(1167862730 | i4)) | (~((-337875188) | elapsedCpuTime))) * 210) + (((~(elapsedCpuTime | 1438628859)) | (~(i4 | (-67109059)))) * 210)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1582155779;
            int i6 = ~length;
            if (i5 != (-1588005832) + (((~((-1011613001) | i6)) | (~(1841600543 | length))) * 217) + (((~(length | (-1011613001))) | 269182272) * 217) + (((~(1841600543 | i6)) | 1011613000) * 217)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        if (i7 != (-1205616388) + (((~((-1757809480) | i8)) | 549587461) * 336) + (((~(i8 | 821246485)) | (-2029468504)) * (-168)) + (((~((~i8) | 821246485)) | (-1757809480)) * 168)) {
            throw new RuntimeException("285802371");
        }
        super.onResume();
        int i9 = cancel + 113;
        cancelAll = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = ~((-286262858) | iFreeMemory);
        int i6 = ~iFreeMemory;
        if (i4 != (-1745625752) + ((i5 | (~(i6 | 2008805375))) * 920) + (((~((-892554976) | i6)) | 286262857) * 920) + (((~(iFreeMemory | 2008805375)) | (~((-286262858) | i6)) | (~((-606292119) | iFreeMemory))) * 920)) {
            throw new RuntimeException("-1210555727");
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != (-238692436) + ((~((~iIdentityHashCode) | (-1896284978))) * (-116)) + ((183528654 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 1899439985)) | 180373646) * 116)) {
            int i8 = 1307157498 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = cancelAll + 83;
        cancel = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 51;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        DeviceUnlinkingVerificationActivity.Companion companion = DeviceUnlinkingVerificationActivity.INSTANCE;
        DeviceUnlinkingVerificationActivity.Companion.b(deviceUnlinkingEmailActivity, (String) deviceUnlinkingEmailActivity.b.getValue(), (String) deviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), (String) deviceUnlinkingEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), (String) deviceUnlinkingEmailActivity.d.getValue(), (String) deviceUnlinkingEmailActivity.g.getValue());
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 47;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ String b(DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingEmailActivity.getIntent().getStringExtra("key_message");
        int i4 = cancelAll + 33;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 37;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingEmailActivity.getIntent().getStringExtra("email");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = cancelAll + 81;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String stringExtra;
        DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity = (DeviceUnlinkingEmailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 107;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            stringExtra = deviceUnlinkingEmailActivity.getIntent().getStringExtra("key_jenis_form");
            int i3 = 25 / 0;
        } else {
            stringExtra = deviceUnlinkingEmailActivity.getIntent().getStringExtra("key_jenis_form");
        }
        int i4 = cancelAll + 43;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity) {
        int i = 2 % 2;
        int i2 = cancel + 123;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingEmailActivity.getIntent().getStringExtra("key_transaction_id");
        int i4 = cancel + 123;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 69;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingEmailActivity.getIntent().getStringExtra("key_title_message");
        int i4 = cancelAll + 43;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingEmailActivity deviceUnlinkingEmailActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault2(BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 106636842, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -106636840, new Object[]{deviceUnlinkingEmailActivity});
    }

    static {
        INotificationSideChannel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = onTransact + 89;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel + 39;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return R.layout.activity_device_unlinking_email;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater1 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(BatchFileOrchestrator$getMetadataFile$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -567489698, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 567489699, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 61;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancel + 89;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancelAll + 33;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.google.firebase.components.R.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater3, iTuitionPaymentFragmentbindingInflater2, -1113666331, iTuitionPaymentFragmentbindingInflater1, 1113666331, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 39;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = cancel + 79;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        d = (char) 52737;
        asInterface = (char) 31089;
        g = (char) 35951;
        f513a = (char) 38297;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r7, byte r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingEmailActivity.$$c
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = r9 * 2
            int r9 = r9 + 108
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2e
        L16:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1a:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingEmailActivity.$$i(int, byte, byte):java.lang.String");
    }
}
