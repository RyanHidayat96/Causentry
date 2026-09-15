package com.bpjstku.presentation.membership.registration;

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
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda9;
import com.bpjstku.databinding.ActivityChooseNationalityBinding;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.presentation.membership.registration.ChooseNationalityActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0015X\u0095D¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/ChooseNationalityActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityChooseNationalityBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/widget/ArrayAdapter;", "", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChooseNationalityActivity extends BindingReactiveFormActivity<ActivityChooseNationalityBinding> {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.activity_choose_nationality;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: onEditorAction
        private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
        private static final int $$f = 28;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {68, -119, -76, 97, -17, -3, 58, -62, -13, -5, 3, -10, 2, 50, -56, -18, 5, -19, -2, 1, 0, 49, -68, 7, -24, 10, -18, 4, 3, -16, 57, -58, -17, -2, -8, -8, 63, -76, -4, 6, -8, -2, -16, 6, -1, -19, 64, -40, -41, 15, -18, -11, 6, -22, 16, -18, 22, -35, 76, -36, -52, 8, -1, -24, 10, 30, -50, -14, 14, -19, 28, -24, -19, -7, 4, -13};
        private static final int $$e = 169;
        private static final byte[] $$a = {1, -81, 2, 79, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 106;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {59790, 59732, 59697, 59764, 59760, 59697, 59771, 59774, 59760, 59765, 59771, 59761, 59750, 59772, 59748, 59760, 59763, 59716, 59762, 59770, 59787, 59764, 59705, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59758, 59747, 59757, 59747, 59770, 59751, 59721, 59784, 59791, 59783, 59781, 59764, 59788, 59804, 59780, 59803, 59803, 59780, 59783, 59768, 59731, 59771, 59802, 59778, 59747, 59745, 59788, 59782, 59802, 59783, 59777, 59779, 59735, 59826, 59836, 59832, 59812, 59808, 59832, 59836, 59838, 59836, 59834, 59838, 59831, 59824, 59839, 59833, 59825, 59816, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59707, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757, 59756, 59759, 59746, 59730, 59742, 59750};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 52
                int r7 = r7 + 4
                byte[] r0 = defpackage.onEditorAction.$$a
                int r6 = r6 * 14
                int r6 = r6 + 84
                int r1 = 53 - r8
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2f
            L16:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1a:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r6
                r6 = r4
                r4 = r5
            L2f:
                int r6 = -r6
                int r7 = r7 + r6
                int r7 = r7 + (-10)
                int r6 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.onEditorAction.a(byte, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 72
                int r0 = 73 - r5
                int r7 = r7 + 98
                int r6 = r6 * 72
                int r6 = 76 - r6
                byte[] r1 = defpackage.onEditorAction.$$d
                byte[] r0 = new byte[r0]
                int r5 = 72 - r5
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                int r3 = r3 + 1
                r4 = r1[r6]
            L28:
                int r4 = -r4
                int r7 = r7 + r4
                int r6 = r6 + 1
                int r7 = r7 + (-5)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.onEditorAction.d(int, short, int, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            int i4 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 31533);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 922;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 29;
                byte[] bArr = $$a;
                byte b = bArr[0];
                byte b2 = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b, b2, (byte) (b2 | 52), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iIndexOf, iIndexOf2, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 12, 13}, true, null, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 0, 9}, false, new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRed = (char) (31533 - Color.red(0));
                int gidForName = 920 - Process.getGidForName("");
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                byte b3 = $$a[80];
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                a(b3, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, gidForName, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                    int i7 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr2[80], bArr2[0], (byte) (-bArr2[33]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, i7, i8, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyPid = Process.myPid();
                int i9 = ~iMyPid;
                int i10 = ((1053551265 + (((~((-1279420077) | i9)) | (~((-494659568) | iMyPid))) * (-370))) + ((((~(iMyPid | (-1279420077))) | (~(i9 | (-494659568)))) | (-1568401392)) * (-370))) - 1109070655;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 33, 0}, true, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 73, 10}, false, new byte[]{1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{81, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 0, 10}, true, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -621140575};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[20];
                    byte b6 = bArr3[19];
                    Object[] objArr13 = new Object[1];
                    d(b5, b6, b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr3[19];
                    byte b8 = bArr3[20];
                    Object[] objArr14 = new Object[1];
                    d(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int i15 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iAxisFromString = MotionEvent.axisFromString("") + 29;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[80];
                        byte b10 = bArr4[0];
                        byte b11 = (byte) (-bArr4[33]);
                        Object[] objArr16 = new Object[1];
                        a(b9, b10, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, i15, iAxisFromString, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 12, 13}, true, null, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 0, 9}, false, new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int i16 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                            byte b12 = $$a[80];
                            byte b13 = b12;
                            Object[] objArr19 = new Object[1];
                            a(b12, b13, b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i16, windowTouchSlop, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                            int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iBlue = 28 - Color.blue(0);
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[0];
                            byte b15 = bArr5[80];
                            Object[] objArr20 = new Object[1];
                            a(b14, b15, (byte) (b15 | 52), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, modifierMetaStateMask, iBlue, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[3])[0];
            if (i18 != i17) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                    while (true) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                        int i20 = i19 % 2;
                        if (i4 >= strArr.length) {
                            break;
                        }
                        arrayList.add(strArr[i4]);
                        i4++;
                        i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    }
                }
                throw new RuntimeException(String.valueOf(i18));
            }
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i22 = ~((-555146256) | iMyUid);
            int i23 = (-961805761) + ((554732547 | i22) * (-280)) + ((i22 | (~((-1218933389) | iMyUid))) * 140);
            int i24 = ~((-413709) | iMyUid);
            int i25 = ~iMyUid;
            int i26 = i21 + i23 + (((~(i25 | (-1218519681))) | i24 | (~((-554732548) | i25))) * 140);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr21[0])[0] = i28 ^ (i28 << 5);
            return ChooseNationalityActivity.b(this.b);
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int length;
            char[] cArr;
            int i2;
            int i3 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i4 = 0;
            int i5 = iArr[0];
            int i6 = 1;
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            long j = 0;
            if (cArr2 != null) {
                int i10 = $11 + 1;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr2[i2]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i4;
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == j ? 0 : -1)) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 1270, KeyEvent.keyCodeFromString("") + 18, 407021364, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i2++;
                        i4 = 0;
                        i6 = 1;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i7];
            System.arraycopy(cArr2, i5, cArr3, 0, i7);
            if (bArr != null) {
                char[] cArr4 = new char[i7];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i7) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i11 = $10 + 31;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = setvideostabilizationmode.b;
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getSize(0), 3225 - View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, 2133916302, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i13 = setvideostabilizationmode.b;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getMode(0), 3225 - Gravity.getAbsoluteGravity(0, 0), 13 - TextUtils.indexOf("", "", 0, 0), 2133916302, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 29944), Color.alpha(0) + 1755, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, 387247676, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41240 - ImageFormat.getBitsPerPixel(0)), 1705 - (ViewConfiguration.getTapTimeout() >> 16), 21 - (ViewConfiguration.getPressedStateDuration() >> 16), -1434471773, false, $$g(b9, (byte) (b9 | 6), b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i9 > 0) {
                int i15 = $10 + 53;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    char[] cArr5 = new char[i7];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 1, i7);
                    System.arraycopy(cArr5, 0, cArr3, i7 - i9, i9);
                    System.arraycopy(cArr5, i9, cArr3, 1, i7 / i9);
                } else {
                    i = 0;
                    char[] cArr6 = new char[i7];
                    System.arraycopy(cArr3, 0, cArr6, 0, i7);
                    int i16 = i7 - i9;
                    System.arraycopy(cArr6, 0, cArr3, i16, i9);
                    System.arraycopy(cArr6, i9, cArr3, 0, i16);
                }
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr7 = new char[i7];
                setvideostabilizationmode.b = i;
                while (setvideostabilizationmode.b < i7) {
                    cArr7[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                    int i17 = $10 + 109;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 3 / 2;
                    }
                }
                cArr3 = cArr7;
            }
            if (i8 > 0) {
                int i19 = 0;
                while (true) {
                    setvideostabilizationmode.b = i19;
                    if (setvideostabilizationmode.b >= i7) {
                        break;
                    }
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i19 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r7, int r8, short r9) {
            /*
                byte[] r0 = defpackage.onEditorAction.$$c
                int r8 = r8 + 99
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r9 = r9 * 4
                int r9 = r9 + 1
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r5 = r2
                r8 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                int r7 = r7 + 1
                if (r5 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = r7 + r3
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.onEditorAction.$$g(short, int, short):java.lang.String");
        }
    });
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$f = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, -103, 118, 14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 22;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f543a = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = i7 | i2;
        int i9 = (~i8) | (~(i7 | i3));
        int i10 = (~((~i3) | i7 | (~i2))) | (~(i6 | i2));
        int i11 = i6 + i2 + i5 + ((-540997959) * i4) + (162607451 * i);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i6) + 1723858944 + (1667710703 * i2) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i5) + ((-672137216) * i4) + (483393536 * i) + (377683968 * i12);
        int i14 = (i6 * 228155117) + 240245784 + (i2 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i5 * 228155391) + (i4 * (-329950905)) + (i * (-2026639707)) + (i12 * 159186944);
        int i15 = i13 + (i14 * i14 * (-1451425792));
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 196 - r6
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.c(short, short, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        f543a = i2 % 128;
        if (i2 % 2 != 0) {
            ChooseNationalityActivity$bindingInflater$1 chooseNationalityActivity$bindingInflater$1 = ChooseNationalityActivity$bindingInflater$1.b;
            throw null;
        }
        ChooseNationalityActivity$bindingInflater$1 chooseNationalityActivity$bindingInflater$2 = ChooseNationalityActivity$bindingInflater$1.b;
        int i3 = asBinder + 21;
        f543a = i3 % 128;
        int i4 = i3 % 2;
        return chooseNationalityActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f543a + 33;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 105;
        f543a = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.ChooseNationalityActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/ChooseNationalityActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ChooseNationalityActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        f543a = i2 % 128;
        int i3 = i2 % 2;
        ChooseNationalityActivity chooseNationalityActivity = this;
        Intrinsics.checkNotNullParameter(chooseNationalityActivity, "");
        chooseNationalityActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_string_null));
        int i4 = asBinder + 17;
        f543a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: SearchView8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseNationalityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        int i2 = asBinder + 93;
        f543a = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ChooseNationalityActivity chooseNationalityActivity = (ChooseNationalityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 119;
        f543a = i2 % 128;
        int i3 = i2 % 2;
        ((ArrayAdapter) chooseNationalityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).addAll(CollectionsKt.mutableListOf("Warga Negara Indonesia", "Bukan Warga Negara Indonesia"));
        chooseNationalityActivity.INotificationSideChannelStub().actvChooseNationality.setAdapter((ArrayAdapter) chooseNationalityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        int i4 = asBinder + 31;
        f543a = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        f543a = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = f543a + 39;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = f543a + 73;
        asBinder = i2 % 128;
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
        int i3 = f543a + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilChooseNationality;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = f543a + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f543a + 119;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i3 = f543a + 31;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 43;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", c) + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267, 33 - Drawable.resolveOpacity(0, 0), -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267, Color.blue(0) + 33, -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 122;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $10 + 97;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (49268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iIndexOf = 3260 - TextUtils.indexOf((CharSequence) "", '0');
                        int iAxisFromString = 29 - MotionEvent.axisFromString("");
                        byte b6 = (byte) ($$f & 7);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf, iAxisFromString, -127612708, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i10 = $10 + 31;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 3;
                            byte b9 = (byte) (b8 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - KeyEvent.normalizeMetaState(0)), 594 - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 16777233, 1570859318, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i13 = $10 + 75;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            int i20 = $10 + 121;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 10842);
                i19 += 54;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (29944 - Color.green(0));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 193), (byte) 37, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iIndexOf, scrollBarFadeDuration, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = asBinder + 27;
            f543a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 156), (byte) 52, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionGroup, iMakeMeasureSpec, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i5 = ~i4;
            int i6 = (((((~(i5 | 960446481)) | ((~((-960446482) | i4)) | (~(747844055 | i5)))) * 959) - 1209511432) + (((~(i4 | 960446481)) | ((~(i5 | (-960446482))) | (~(747844055 | i4)))) * 959)) - 599311128;
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{11, 7, 5, 7, 0, 23, 7, 1, 18, 0, 4, 15, 23, 24, 20, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_smile).substring(4, 5).codePointAt(0) + 2), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{'\f', '\t', 22, 4, 24, '\r', 24, 18, 16, 11, 21, 2, '\r', 15, '\t', 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 61), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_transfer).substring(0, 13).length() + 3, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1558324930};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0, 0)), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 29 - TextUtils.indexOf("", "", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -599311128);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) (29944 - View.MeasureSpec.getSize(0));
                    int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                    int defaultSize = 23 - View.getDefaultSize(0, 0);
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b3, (short) (b3 | 156), (byte) 52, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, iRgb, defaultSize, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{7, 1, '\f', 22, 19, '\r', '\b', 2, 17, 23, 4, 1, 17, 24, 24, 20, '\n', 15, 23, 15, 1, 21}, (byte) (88 - TextUtils.lastIndexOf("", '0')), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{20, 21, '\t', 1, 23, 20, '\b', '\t', 21, '\t', 21, 24, '\n', '\t', 13895}, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                        int iResolveSize = 1755 - View.resolveSize(0, 0);
                        int size2 = View.MeasureSpec.getSize(0) + 23;
                        byte b4 = $$a[7];
                        short s = (short) (b4 | 104);
                        Object[] objArr11 = new Object[1];
                        c(b4, s, (byte) (s >>> 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iResolveSize, size2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                        int maximumFlingVelocity2 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c(b5, (short) (b5 | 193), (byte) 37, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, maximumFlingVelocity2, modifierMetaStateMask, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i12 = ~layoutDirection;
            int i13 = i11 + 40087857 + ((layoutDirection | (-112791803)) * 140) + (((~((-112791803) | i12)) | 35721264) * (-280)) + (((~(layoutDirection | (-35721265))) | (~(325394228 | i12)) | (-402464767)) * 140);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
            int i16 = f543a + 21;
            asBinder = i16 % 128;
            int i17 = i16 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i18 = asBinder + 105;
                f543a = i18 % 128;
                for (int i19 = i18 % 2 != 0 ? 1 : 0; i19 < strArr.length; i19++) {
                    arrayList.add(strArr[i19]);
                }
            }
            int[] iArr = new int[i10];
            int i20 = i10 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1386762426;
            int i22 = ~length;
            int i23 = i21 + 1189776958 + (((~(286933383 | i22)) | 499535809) * (-90)) + (((~(286933383 | length)) | 1572870) * (-45)) + (((~(length | (-499535810))) | 286933383 | (~(i22 | 499535809))) * 45);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr14[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
            int i26 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b6 = $$a[7];
            short s2 = (short) (b6 | 52);
            Object[] objArr15 = new Object[1];
            c(b6, s2, (byte) s2, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, deadChar, i26, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{7, 1, '\f', 22, 19, '\r', '\b', 2, 17, 23, 4, 1, 17, 24, 24, 20, '\n', 15, 23, 15, 1, 21}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_cvv).substring(0, 3).codePointAt(2) + 3), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{20, 21, '\t', 1, 23, 20, '\b', '\t', 21, '\t', 21, 24, '\n', '\t', 13895}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 61), 15 - View.resolveSizeAndState(0, 0, 0), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int i27 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
            int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            c(b7, (short) (b7 | 156), (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maxKeyCode, i27, maximumDrawingCacheSize, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                int iRed = Color.red(0) + 15;
                byte[] bArr = $$a;
                byte b8 = bArr[28];
                short s3 = bArr[7];
                Object[] objArr19 = new Object[1];
                c(b8, s3, (byte) s3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(doubleTapTimeout, iAxisFromString, iRed, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr20[3])[0];
            int i29 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i30 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 598310592;
            int i31 = ~i30;
            int i32 = ((((-876220093) + ((((~((-20974645) | i31)) | (~((-202199810) | i30))) | (~((-131073) | i30))) * 765)) + (((~((-223174454) | i31)) | 20974644) * 1530)) + (((~(i30 | (-223174454))) | (~(i31 | (-131073)))) * 765)) - 1456737465;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[2])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{11, 7, 5, 7, 0, 23, 7, 1, 18, 0, 4, 15, 23, 24, 20, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 92), (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{'\f', '\t', 22, 4, 24, '\r', 24, 18, 16, 11, 21, 2, '\r', 15, '\t', 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_expiration_message).substring(3, 4).length() + 50), (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1558324930};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Color.red(0)), Color.red(0) + 1134, 17 - ExpandableListView.getPackedPositionChild(0L), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1456737465, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int i35 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i36 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte b9 = $$a[7];
                short s4 = (short) (b9 | 52);
                Object[] objArr25 = new Object[1];
                c(b9, s4, (byte) s4, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(offsetAfter, i35, i36, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1118, TextUtils.lastIndexOf("", '0', 0) + 18), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int i37 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                byte[] bArr2 = $$a;
                byte b10 = bArr2[28];
                short s5 = bArr2[7];
                Object[] objArr27 = new Object[1];
                c(b10, s5, (byte) s5, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, i37, iNormalizeMetaState, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{7, 1, '\f', 22, 19, '\r', '\b', 2, 17, 23, 4, 1, 17, 24, 24, 20, '\n', 15, 23, 15, 1, 21}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 88), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_3).substring(2, 3).length() + 21, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{20, 21, '\t', 1, 23, 20, '\b', '\t', 21, '\t', 21, 24, '\n', '\t', 13895}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 36), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
                    byte b11 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b11, (short) (b11 | 156), (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, bitsPerPixel, iLastIndexOf, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c5 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                    int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                    byte b12 = $$a[7];
                    short s6 = (short) (b12 | 52);
                    Object[] objArr31 = new Object[1];
                    c(b12, s6, (byte) s6, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c5, absoluteGravity, trimmedLength, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArr[1])[0];
        int i39 = ((int[]) objArr[3])[0];
        if (i39 == i38) {
            int i40 = f543a + 37;
            asBinder = i40 % 128;
            int i41 = i40 % 2;
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i42 = ((int[]) objArr[2])[0];
            int i43 = ((int[]) objArr[3])[0];
            int i44 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i45 = 462464089 + (((~((-490604551) | iIdentityHashCode)) | 286261250 | (~(246324380 | iIdentityHashCode))) * (-880));
            int i46 = (~((-490604551) | (~iIdentityHashCode))) | (-246324381);
            int i47 = ~(iIdentityHashCode | 490604550);
            int i48 = i42 + i45 + ((i46 | i47) * (-880)) + (i47 * 880);
            int i49 = i48 ^ (i48 << 13);
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr32[2])[0] = i50 ^ (i50 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i51 = f543a + 1;
            asBinder = i51 % 128;
            int i52 = i51 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr2 = new int[i39];
        int i53 = i39 - 1;
        iArr2[i53] = 1;
        Toast.makeText((Context) null, iArr2[((i39 * i53) % 2) - 1], 1).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i54 = ((int[]) objArr[2])[0];
        int i55 = ((int[]) objArr[3])[0];
        int i56 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int layoutDirection2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i57 = ~((-4231595) | layoutDirection2);
        int i58 = ~layoutDirection2;
        int i59 = i54 + (-1155175919) + ((i57 | (~((-134217745) | i58))) * 920) + (((~((-105830832) | i58)) | 4231594) * 920) + (((~(layoutDirection2 | (-134217745))) | (~((-4231595) | i58)) | (~((-101599238) | layoutDirection2))) * 920);
        int i60 = (i59 << 13) ^ i59;
        int i61 = i60 ^ (i60 >>> 17);
        ((int[]) objArr33[2])[0] = i61 ^ (i61 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1006200499
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r11)
            int r5 = ~r4
            r6 = -1127516133(0xffffffffbccb781b, float:-0.024837544)
            r7 = r5 | r6
            int r7 = ~r7
            r8 = 1107559136(0x420402e0, float:33.002808)
            r7 = r7 | r8
            r9 = -277571594(0xffffffffef7497f6, float:-7.569805E28)
            r10 = r9 | r4
            int r10 = ~r10
            r7 = r7 | r10
            int r7 = r7 * 717
            r10 = 1488477439(0x58b85cff, float:1.6216764E15)
            int r10 = r10 + r7
            r5 = r5 | r9
            int r5 = ~r5
            r5 = r5 | r8
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 717
            int r10 = r10 + r4
            if (r1 == r10) goto L58
            int r1 = com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.f543a
            int r1 = r1 + 125
            int r4 = r1 % 128
            com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.asBinder = r4
            int r1 = r1 % r0
            r1 = -1006200499(0xffffffffc406994d, float:-538.3953)
            int[] r1 = new int[r1]
            r4 = -1006200500(0xffffffffc406994c, float:-538.39526)
            r5 = 1
            r1[r4] = r5
            r4 = -1352497188(0xffffffffaf6287dc, float:-2.0602847E-10)
            int r4 = r4 % r0
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        L58:
            java.lang.reflect.Member[] r1 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r3 = android.os.Process.myUid()
            r4 = -2041592491(0xffffffff864fc555, float:-3.907735E-35)
            r5 = r4 | r3
            int r5 = ~r5
            r6 = 1505308696(0x59b93018, float:6.515719E15)
            r5 = r5 | r6
            int r5 = r5 * 398
            r7 = -573099296(0xffffffffddd732e0, float:-1.9383378E18)
            int r5 = r5 + r7
            int r3 = ~r3
            r3 = r3 | r4
            int r3 = ~r3
            r3 = r3 | r6
            int r3 = r3 * 398
            int r5 = r5 + r3
            if (r1 != r5) goto L91
            super.onResume()
            int r1 = com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.f543a
            int r1 = r1 + 115
            int r3 = r1 % 128
            com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.asBinder = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L90
            r0 = 37
            int r0 = r0 / r2
        L90:
            return
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "1517574549"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f543a + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~(863541156 | iIdentityHashCode);
        int i6 = ~iIdentityHashCode;
        int i7 = i5 | (~(33553613 | i6));
        int i8 = ~((-863541157) | i6);
        if (i4 != 125579104 + ((i7 | i8) * (-516)) + (((~(iIdentityHashCode | (-8874058))) | (~((-24679557) | i6))) * 516) + ((24679556 | i8) * 516)) {
            int i9 = (-1751012486) % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 193710195;
        int i11 = ~length;
        if (i10 != 942615536 + (((~((-1007027040) | i11)) | (~((-1572028926) | i11))) * (-867)) + (((~((-1007027040) | length)) | 469893469 | (~((-1572028926) | length))) * (-1734)) + (((~(length | (-1102135457))) | (~(i11 | (-469893470))) | (~((-537133571) | length))) * 867)) {
            throw null;
        }
        super.onStart();
        int i12 = f543a + 117;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        f543a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 2007683688 + ((1602791167 | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 387653140)) | 1216389355) * (-376)) + (((~(iIdentityHashCode | (-387653141))) | (-1217640684)) * 376)) {
            throw null;
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ~Process.myUid();
        if (i5 != (-1237905941) + ((~((-296124417) | i6)) * (-783)) + (((~(i6 | 1678861020)) | (-900194945)) * 783)) {
            int i7 = (-439875334) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i8 = f543a + 105;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChooseNationalityActivity chooseNationalityActivity, View view) {
        Editable text;
        Citizenship citizenship;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "register_account_choose_nationality"));
        Intrinsics.checkNotNullParameter(chooseNationalityActivity, "");
        Intrinsics.checkNotNullParameter("register_account_choose_nationality", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("register_account_choose_nationality", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("register_account_choose_nationality", mapMutableMapOf);
        RegisteredMemberRegistration registeredMemberRegistration = new RegisteredMemberRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
        EditText editText = chooseNationalityActivity.INotificationSideChannelStub().tilChooseNationality.getEditText();
        if (editText != null) {
            text = editText.getText();
            int i2 = f543a + 125;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            text = null;
        }
        if (StringsKt.equals(String.valueOf(text), "Warga Negara Indonesia", true)) {
            int i4 = asBinder + 69;
            f543a = i4 % 128;
            if (i4 % 2 != 0) {
                citizenship = Citizenship.WNI;
                int i5 = 30 / 0;
            } else {
                citizenship = Citizenship.WNI;
            }
        } else {
            citizenship = Citizenship.WNA;
        }
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, citizenship, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388599);
        RegistrationStatusActivity.Companion companion = RegistrationStatusActivity.INSTANCE;
        RegistrationStatusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(chooseNationalityActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ArrayAdapter b(ChooseNationalityActivity chooseNationalityActivity) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(chooseNationalityActivity, R.layout.support_simple_spinner_dropdown_item);
        int i2 = asBinder + 27;
        f543a = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayAdapter;
        }
        throw null;
    }

    static {
        g = 1;
        g();
        INSTANCE = new Companion(null);
        int i = d + 107;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityChooseNationalityBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = JankStatsActivityLifecycleListener$onActivityStopped$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Function1) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 1978632385, -2030392056, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, JankStatsActivityLifecycleListener$onActivityStopped$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, 2030392056);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int length = 266716808 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1874215989, 986168151, length, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, -986168150);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        f543a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 154527312;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1353905956, iCodePointAt, JankStatsActivityLifecycleListener$onActivityStopped$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, 1353905958);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        f543a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = f543a + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{60072, 60051, 60053, 60117, 60043, 60054, 60058, 60063, 60073, 60045, 60088, 60083, 60049, 60075, 60050, 60060, 60048, 60041, 60052, 60034, 60055, 60056, 60040, 60047, 60062};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f543a + 19;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, int r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r5 = r5 + 113
            byte[] r1 = com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.$$c
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseNationalityActivity.$$i(int, int, byte):java.lang.String");
    }
}
