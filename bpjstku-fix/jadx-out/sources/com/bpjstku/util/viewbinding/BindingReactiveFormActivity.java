package com.bpjstku.util.viewbinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
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
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.nbs.validacion.ReactiveFormActivity;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00028\u00008EX\u0085\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/nbs/validacion/ReactiveFormActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/Lazy;", "INotificationSideChannelStub", "()Landroidx/viewbinding/ViewBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BindingReactiveFormActivity<B extends ViewBinding> extends ReactiveFormActivity {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: AutoValue_ResolutionInfo_ResolutionInfoInternal
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindingReactiveFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });
    private static final byte[] $$l = {114, -59, 10, 31};
    private static final int $$o = 201;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$e = 174;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60060, 60058, 60034, 60062, 60048, 60045, 60047, 60073, 60052, 60054, 60055, 60083, 60088, 60051, 60050, 60041, 60049, 60043, 60072, 60040, 60053, 60056, 60117, 59745, 60063};
    private static char TuitionPaymentFragmentbindingInflater1 = 57188;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.util.viewbinding.BindingReactiveFormActivity.$$d
            int r5 = r5 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r5 = r5 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.viewbinding.BindingReactiveFormActivity.h(short, int, short, java.lang.Object[]):void");
    }

    protected abstract Function1<LayoutInflater, B> TuitionPaymentFragmentbindingInflater1();

    public final B INotificationSideChannelStub() {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
            int iAxisFromString = MotionEvent.axisFromString("") + 45;
            byte[] bArr = $$d;
            short s = bArr[80];
            Object[] objArr2 = new Object[1];
            h(s, (byte) (s & 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, keyRepeatTimeout, iAxisFromString, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(22 - TextUtils.indexOf("", "", 0), new char[]{0, 21, 20, 19, '\t', '\r', 20, 23, '\t', 18, 23, 17, 4, 17, '\b', 1, 7, 14, '\r', 5, 24, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 49), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 92, new char[]{0, '\r', 2, 16, 18, 4, 22, '\t', 4, 2, 11, 5, 19, 14, 13920}, (byte) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_title).substring(0, 18).codePointAt(13), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
            int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr2 = $$d;
            Object[] objArr5 = new Object[1];
            h((short) 51, bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, maximumDrawingCacheSize, offsetAfter, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int packedPositionGroup = 651 - ExpandableListView.getPackedPositionGroup(0L);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                Object[] objArr6 = new Object[1];
                h((short) 51, (byte) 37, $$d[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, packedPositionGroup, jumpTapTimeout, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i7 = (((756339566 + ((~((~i6) | (-405340417))) * 433)) + (((~(418976640 | i6)) | (-422407451)) * (-433))) + (((~(i6 | (-422407451))) | 13636224) * 433)) - 1484360886;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.combineMeasuredStates(0, 0), 1610 - TextUtils.indexOf("", "", 0, 0), 26 - (Process.myTid() >> 22), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1484360886, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                    int longPressTimeout = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int trimmedLength = 44 - TextUtils.getTrimmedLength("");
                    byte[] bArr3 = $$d;
                    byte b = bArr3[7];
                    byte b2 = bArr3[5];
                    Object[] objArr9 = new Object[1];
                    h((short) 51, b, b2, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, longPressTimeout, trimmedLength, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ImageFormat.getBitsPerPixel(0) + 1), 695 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 98 - Color.blue(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myTid() >> 22) + 63406), TextUtils.indexOf((CharSequence) "", '0') + 794, 82 - TextUtils.lastIndexOf("", '0', 0, 0)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int i10 = 652 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int mirror = '\\' - AndroidCharacter.getMirror('0');
                    Object[] objArr10 = new Object[1];
                    h((short) 51, (byte) 37, $$d[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i10, mirror, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    i(22 - TextUtils.indexOf("", "", 0, 0), new char[]{0, 21, 20, 19, '\t', '\r', 20, 23, '\t', 18, 23, 17, 4, 17, '\b', 1, 7, 14, '\r', 5, 24, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).length() + 56), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    i(15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{0, '\r', 2, 16, 18, 4, 22, '\t', 4, 2, 11, 5, 19, 14, 13920}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 10), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 45;
                        byte[] bArr4 = $$d;
                        Object[] objArr13 = new Object[1];
                        h((short) 51, bArr4[7], bArr4[5], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, i11, packedPositionChild, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int defaultSize = View.getDefaultSize(0, 0) + 651;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 44;
                        byte[] bArr5 = $$d;
                        short s2 = bArr5[80];
                        Object[] objArr14 = new Object[1];
                        h(s2, (byte) (s2 & 52), bArr5[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, defaultSize, packedPositionType, -459846511, false, (String) objArr14[0], null);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            int iNextInt = new Random().nextInt(502084462);
            int i17 = i14 + (((~(74097532 | iNextInt)) | (-16014955)) * 262) + 1552904849 + (((~((~iNextInt) | 74097532)) | (-16014955)) * 262);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 2 / 3;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i22 = i13 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i22) % 2) - 1], 1).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode;
            int i27 = i23 + (((~(659237184 | i26)) | (~((-662667995) | iIdentityHashCode)) | (~(i26 | 662667994))) * 959) + 998186610 + (((~(iIdentityHashCode | 662667994)) | (~(i26 | (-662667995))) | (~(659237184 | iIdentityHashCode))) * 959);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr16[3])[0] = i29 ^ (i29 << 5);
            int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
            int i31 = i30 % 2;
        }
        return (B) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle p0) {
        int i = 2 % 2;
        super.onCreate(p0);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        setContentView(INotificationSideChannelStub().getRoot());
        View root = INotificationSideChannelStub().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewCompat.setOnApplyWindowInsetsListener(root, new OnApplyWindowInsetsListener() { // from class: getSensorToBufferTransformMatrix
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return BindingReactiveFormActivity.b(view, windowInsetsCompat);
            }
        });
        if (Build.VERSION.SDK_INT >= 35) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            root.requestApplyInsets();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0190  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f4 A[Catch: all -> 0x03bf, TryCatch #0 {all -> 0x03bf, blocks: (B:9:0x0035, B:11:0x0043, B:12:0x0072, B:15:0x0086, B:17:0x0097, B:18:0x00cd, B:23:0x00f3, B:25:0x0104, B:26:0x0138, B:44:0x01aa, B:46:0x01f4, B:47:0x026f, B:51:0x0284, B:53:0x02c1, B:55:0x032c), top: B:72:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0282  */
    /* JADX WARN: Code duplicated, block: B:53:0x02c1 A[Catch: all -> 0x03bf, TryCatch #0 {all -> 0x03bf, blocks: (B:9:0x0035, B:11:0x0043, B:12:0x0072, B:15:0x0086, B:17:0x0097, B:18:0x00cd, B:23:0x00f3, B:25:0x0104, B:26:0x0138, B:44:0x01aa, B:46:0x01f4, B:47:0x026f, B:51:0x0284, B:53:0x02c1, B:55:0x032c), top: B:72:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0329  */
    /* JADX WARN: Code duplicated, block: B:57:0x034d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0357  */
    /* JADX WARN: Code duplicated, block: B:60:0x0389  */
    private static void i(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c = '0';
        int i5 = 1770390596;
        int i6 = 3;
        if (cArr2 != null) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 103;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2267;
                            int iLastIndexOf = TextUtils.lastIndexOf("", c, 0) + 34;
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, offsetBefore, iLastIndexOf, -1927765101, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i9 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 3;
                        byte b5 = (byte) (b4 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2266 - ImageFormat.getBitsPerPixel(0), 33 - TextUtils.getCapsMode("", 0, 0), -1927765101, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    i9++;
                }
                int i11 = $10 + 41;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i3 = 2;
                c = '0';
                i5 = 1770390596;
                i6 = 3;
            }
            cArr2 = cArr3;
        }
        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            byte b6 = (byte) 3;
            byte b7 = (byte) (b6 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2267 - Color.argb(0, 0, 0, 0), 33 - ExpandableListView.getPackedPositionGroup(0L), -1927765101, false, $$r(b6, b7, b7), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i13 = $11 + 123;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b8 = (byte) 2;
                            byte b9 = (byte) (b8 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 3262, 30 - (ViewConfiguration.getLongPressTimeout() >> 16), -127612708, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22877), 594 - Gravity.getAbsoluteGravity(0, 0), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1570859318, false, $$r(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i15 = $11 + 17;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        } else {
                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b12 = (byte) 2;
                            byte b13 = (byte) (b12 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 3262, 30 - (ViewConfiguration.getLongPressTimeout() >> 16), -127612708, false, $$r(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b14 = (byte) 0;
                                byte b15 = b14;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22877), 594 - Gravity.getAbsoluteGravity(0, 0), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1570859318, false, $$r(b14, b15, b15), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).intValue();
                            int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i111 = $11 + 17;
                            $10 = i111 % 128;
                            int i112 = i111 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                        } else {
                            int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i115];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iBlue = 1031 - Color.blue(0);
            int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
            Object[] objArr2 = new Object[1];
            h((short) 88, (byte) 52, $$d[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iBlue, bitsPerPixel, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).length() + 21, new char[]{0, 21, 20, 19, '\t', '\r', 20, 23, '\t', 18, 23, 17, 4, 17, '\b', 1, 7, 14, '\r', 5, 24, 1}, (byte) (57 - KeyEvent.normalizeMetaState(0)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, 3).length() + 13, new char[]{0, '\r', 2, 16, 18, 4, 22, '\t', 4, 2, 11, 5, 19, 14, 13920}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_face_detection_failed_with_error).substring(0, 39).codePointAt(18) - 11), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iAxisFromString = 1030 - MotionEvent.axisFromString("");
            int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr5 = new Object[1];
            h((short) ($$e & 989), (byte) 52, $$d[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iAxisFromString, iMakeMeasureSpec, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                byte[] bArr = $$d;
                Object[] objArr6 = new Object[1];
                h((short) 51, bArr[7], bArr[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, iKeyCodeFromString, minimumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).codePointAt(0) - 782770650);
            int i7 = (((-713243165) + (((-1065546) | i6) * 494)) + (((~(i6 | 133146784)) | (-24144490)) * 494)) - 1590822594;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.saved_card).substring(7, 9).length() + 14, new char[]{21, 6, 6, 0, 20, '\f', 0, 21, 2, 20, 17, 3, 16, '\t', 4, '\b'}, (byte) (8 - Process.getGidForName("")), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, new char[]{19, 4, 0, 23, '\t', 11, 7, 1, 16, 6, 18, 14, '\r', 7, 23, 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.shipping_cb_message).substring(0, 3).length() + 24), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1041796739};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46038), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1590822594, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int iResolveSize = 1031 - View.resolveSize(0, 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                    Object[] objArr12 = new Object[1];
                    h((short) 88, (byte) 52, $$d[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, iResolveSize, capsMode, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore("", 0) + 45993), 1117 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int iRed = Color.red(0) + 1031;
                    int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr2 = $$d;
                    Object[] objArr13 = new Object[1];
                    h((short) 51, bArr2[7], bArr2[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iRed, pressedStateDuration, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, new char[]{0, 21, 20, 19, '\t', '\r', 20, 23, '\t', 18, 23, 17, 4, 17, '\b', 1, 7, 14, '\r', 5, 24, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step1).substring(2, 4).codePointAt(0) - 59), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, new char[]{0, '\r', 2, 16, 18, 4, 22, '\t', 4, 2, 11, 5, 19, 14, 13920}, (byte) (97 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iKeyCodeFromString2 = 15 - KeyEvent.keyCodeFromString("");
                        Object[] objArr16 = new Object[1];
                        h((short) ($$e & 989), (byte) 52, $$d[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, longPressTimeout, iKeyCodeFromString2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                        int iMyPid = 15 - (Process.myPid() >> 22);
                        Object[] objArr17 = new Object[1];
                        h((short) 88, (byte) 52, $$d[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, maxKeyCode2, iMyPid, 1357589585, false, (String) objArr17[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i15 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i16 = ~i15;
            int i17 = ~(700554433 | i16);
            int i18 = i12 + 1215968737 + (((-1005829592) | i17) * (-712)) + (((~(i15 | (-305275159))) | (~(i16 | 1005829591))) * (-712)) + ((456274263 | i17) * 712);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i21 = i11 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i21) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i25 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i26 = i22 + (-1272732631) + (((~(i25 | 168905992)) | (-243228522)) * (-160)) + (((~(i25 | (-75374178))) | 168905992) * 160);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr19[2])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
            int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
            Object[] objArr20 = new Object[1];
            h((short) 51, (byte) 37, $$d[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetAfter, jumpTapTimeout, iLastIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 1755;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
                Object[] objArr21 = new Object[1];
                h((short) ($$e & 989), (byte) 52, $$d[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore, iKeyCodeFromString3, iLastIndexOf2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i29 = 1851185771 + (((~((-355174382) | iIdentityHashCode)) | 2818465 | (~((-142571956) | iIdentityHashCode))) * (-754));
            int i30 = ~((-2818466) | iIdentityHashCode);
            int i31 = ~iIdentityHashCode;
            int i32 = i29 + ((i30 | (~((-139753491) | i31))) * (-754)) + ((i31 | (-355174382)) * 754) + 1737102338;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            i(View.combineMeasuredStates(0, 0) + 16, new char[]{21, 6, 6, 0, 20, '\f', 0, 21, 2, 20, 17, 3, 16, '\t', 4, '\b'}, (byte) (View.resolveSize(0, 0) + 9), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{19, 4, 0, 23, '\t', 11, 7, 1, 16, 6, 18, 14, '\r', 7, 23, 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 71), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1041796739};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, 29 - TextUtils.indexOf("", "", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1737102338);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                int mirror = AndroidCharacter.getMirror('0') + 1707;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                Object[] objArr26 = new Object[1];
                h((short) ($$e & 989), (byte) 52, $$d[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(edgeSlop, mirror, iCombineMeasuredStates, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{0, 21, 20, 19, '\t', '\r', 20, 23, '\t', 18, 23, 17, 4, 17, '\b', 1, 7, 14, '\r', 5, 24, 1}, (byte) (Color.red(0) + 57), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, new char[]{0, '\r', 2, 16, 18, 4, 22, '\t', 4, 2, 11, 5, 19, 14, 13920}, (byte) (96 - Process.getGidForName("")), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i35 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 23;
                    byte[] bArr3 = $$d;
                    short s = bArr3[80];
                    Object[] objArr29 = new Object[1];
                    h(s, (byte) (s & 52), bArr3[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(modifierMetaStateMask, i35, iCombineMeasuredStates2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                    Object[] objArr30 = new Object[1];
                    h((short) 51, (byte) 37, $$d[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarFadeDuration, iNormalizeMetaState, iIndexOf, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr5 != null) {
                int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                int i39 = i38 % 2;
                for (String str2 : strArr5) {
                    int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                    int i41 = i40 % 2;
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i42 % 128;
        int i43 = i42 % 2;
        int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step6).substring(28, 29).length() + 2052195290;
        int i45 = i44 + 370336724 + (((-41946114) | length) * (-627)) + (((~(48528903 | length)) | 261131329) * (-627)) + (((~(length | 261131329)) | (~((~length) | (-48528904)))) * 627);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
    }

    public static /* synthetic */ WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        view.setPadding(insets.left, insets.top, insets.right, Math.max(insets.bottom, insets2.bottom));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return windowInsetsCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ViewBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(BindingReactiveFormActivity bindingReactiveFormActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Function1<LayoutInflater, B> function1TuitionPaymentFragmentbindingInflater1 = bindingReactiveFormActivity.TuitionPaymentFragmentbindingInflater1();
        LayoutInflater layoutInflater = bindingReactiveFormActivity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        B bInvoke = function1TuitionPaymentFragmentbindingInflater1.invoke(layoutInflater);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return bInvoke;
        }
        throw null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$r(short r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.util.viewbinding.BindingReactiveFormActivity.$$l
            int r6 = 116 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.viewbinding.BindingReactiveFormActivity.$$r(short, int, short):java.lang.String");
    }
}
