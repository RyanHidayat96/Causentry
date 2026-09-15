package com.bpjstku.presentation.program.jpn;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
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
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJpnMainBinding;
import com.bpjstku.presentation.program.jpn.JpnMainActivity;
import com.bpjstku.presentation.program.jpn.model.JpnMenu;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.CameraDeviceStateCallbacksComboDeviceStateCallback;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.getConfigs;
import defpackage.getIncrementalScaleFactor;
import defpackage.getInputChannelCountRanges;
import defpackage.initSession;
import defpackage.layoutHorizontal;
import defpackage.onCaptureSessionEnd;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00118\u0015X\u0094D¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/JpnMainActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJpnMainBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LCameraDeviceStateCallbacksComboDeviceStateCallback;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnMainActivity extends BindingBaseActivity<ActivityJpnMainBinding> {
    private static char TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f608a;
    private static char asInterface;
    private static int cancel;
    private static char g;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$f = 185;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {110, -73, -111, 99, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 138;
    private static int onTransact = 0;
    private static int asBinder = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_jpn_main;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: isEncoderProfilesResolutionValidInQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JpnMainActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = i2 | i3;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = (~(i3 | i8)) | (~(i9 | i2));
        int i12 = i2 + i6 + i4 + (1389894630 * i) + ((-1243605516) * i5);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i2) + 1335230464 + (862422157 * i6) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i4) + (1607991296 * i) + ((-548405248) * i5) + ((-1553596416) * i13);
        int i15 = ((i2 * (-88671125)) - 261777699) + (i6 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i4 * (-88671137)) + ((-349388198) * i) + (i5 * (-147040884)) + (i13 * 182059008);
        int i16 = i14 + (i15 * i15 * (-132513792));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        JpnMainActivity jpnMainActivity = (JpnMainActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i17 = 2 % 2;
        int i18 = d + 41;
        asBinder = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int i20 = 1434956798 + ((i | 146320325) * (-859));
            int i21 = ~i;
            if (i19 != i20 + (((~(146320325 | i21)) | (~((-8956226) | i))) * 859) + (((~(976307868 | i21)) | (-985264094)) * 859)) {
                throw null;
            }
        } else {
            int i22 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iNextInt = new Random().nextInt();
            if (i22 != 18859736 + (((~((-1384195290) | iNextInt)) | 554207746) * (-756)) + (((~iNextInt) | (-1384195290)) * 756)) {
                throw null;
            }
        }
        int i23 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i24 = ~i;
        int i25 = (~((-222791807) | i24)) | android.R.color.system_neutral1_100;
        int i26 = ~(i | 2144324479);
        if (i23 != 1831691772 + ((i25 | i26) * (-713)) + (i26 * 1426) + ((~(1938703137 | i24)) * 713)) {
            int i27 = (-1609700170) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i28 = asBinder + 7;
        d = i28 % 128;
        int i29 = i28 % 2;
        return null;
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
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.presentation.program.jpn.JpnMainActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r1[r6]
        L24:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnMainActivity.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jpn.JpnMainActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/JpnMainActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JpnMainActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        cancel = 1;
        g();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        int i = onTransact + 37;
        cancel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6 = i3 + 91;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJpnMainBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            JpnMainActivity$bindingInflater$1 jpnMainActivity$bindingInflater$1 = JpnMainActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        JpnMainActivity$bindingInflater$1 jpnMainActivity$bindingInflater$2 = JpnMainActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = d + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return jpnMainActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JpnMainActivity jpnMainActivity = this;
        Intrinsics.checkNotNullParameter(jpnMainActivity, "");
        jpnMainActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJpnMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJpnMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_pension_security));
        RecyclerView recyclerView = ((ActivityJpnMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvJpnMenu;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((CameraDeviceStateCallbacksComboDeviceStateCallback) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        int i2 = asBinder + 77;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = asBinder + 117;
                d = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
            int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, packedPositionChild, maxKeyCode, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{19561, 11050, 23764, 56977, 38673, 57152, 65122, 11251, 43108, 19944, 1906, 19374, 12509, 43513, 47065, 13744, 45386, 58869, 21749, 49201, 6503, 32820, 18005, 42162}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay_qris).substring(0, 6).length() + 16, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{56395, 41676, 12926, 60067, 41681, 54751, 1534, 3074, 35574, 1381, 6695, 62042, 35263, 12970, 3700, 32681, 25266, 17239}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int defaultSize = 1031 - View.getDefaultSize(0, 0);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
            byte b = (byte) 52;
            Object[] objArr5 = new Object[1];
            c(b, b, $$a[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, defaultSize, offsetBefore, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 104), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, fadingEdgeLength, absoluteGravity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.checkout_error_empty_response).substring(19, 26).length() + 509630332);
            int i6 = 1764452861 + ((~((-7391815) | i5)) * 52) + (((~(520500664 | i5)) | (~(276220494 | i5)) | (-527892479)) * (-52)) + (((~(i5 | (-520500665))) | 268828680) * 52) + 128035585;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{37265, 19201, 41300, 62494, 10076, 43839, 33484, 51958, 49194, 44040, 11531, 16499, 52600, 43933, 51954, 3514, 57608, 38550}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{9148, 15589, 40896, 24475, 12538, 42822, 28653, 37088, 48569, 42687, 56318, 29949, 45279, 391, 58936, 35512, 43463, 63499}, 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {291827507};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror('0') + 45990), 1134 - Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 128035585, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i9 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, bArr2[7], bArr2[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i9, windowTouchSlop, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 104), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iLastIndexOf, capsMode, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{19561, 11050, 23764, 56977, 38673, 57152, 65122, 11251, 43108, 19944, 1906, 19374, 12509, 43513, 47065, 13744, 45386, 58869, 21749, 49201, 6503, 32820, 18005, 42162}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{56395, 41676, 12926, 60067, 41681, 54751, 1534, 3074, 35574, 1381, 6695, 62042, 35263, 12970, 3700, 32681, 25266, 17239}, 15 - View.MeasureSpec.getMode(0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int capsMode2 = 1031 - TextUtils.getCapsMode("", 0, 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                        byte b6 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        c(b6, b6, $$a[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(threadPriority, capsMode2, iResolveSizeAndState, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int gidForName = 1030 - Process.getGidForName("");
                        int offsetAfter2 = 15 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, bArr3[7], bArr3[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetAfter, gidForName, offsetAfter2, 1357589585, false, (String) objArr17[0], null);
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
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i12 = d + 117;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).length() + 1810696746;
        int i17 = ~length;
        int i18 = i14 + (((~((-36177961) | i17)) | (~(243133289 | length))) * 988) + 1719565857 + (((~(length | (-37324841))) | 1146880 | (~(i17 | 243133289))) * 988);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char gidForName2 = (char) (Process.getGidForName("") + 29945);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1756;
            int iGreen = Color.green(0) + 23;
            Object[] objArr19 = new Object[1];
            c((byte) 37, (short) 104, $$a[5], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(gidForName2, iIndexOf, iGreen, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i21 = asBinder + 31;
            d = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                int iGreen2 = 1755 - Color.green(0);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                byte b7 = (byte) 52;
                Object[] objArr20 = new Object[1];
                c(b7, b7, $$a[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, iGreen2, iKeyCodeFromString, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i23 = ((int[]) objArr21[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i23}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i25 = ~((-546877614) | (~i24));
            int i26 = (((-872198912) | i25 | (~(546877613 | i24))) * (-338)) + 1762113593 + (((~(i24 | (-325321299))) | i25) * 338) + 247010991;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{37265, 19201, 41300, 62494, 10076, 43839, 33484, 51958, 49194, 44040, 11531, 16499, 52600, 43933, 51954, 3514, 57608, 38550}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{9148, 15589, 40896, 24475, 12538, 42822, 28653, 37088, 48569, 42687, 56318, 29949, 45279, 391, 58936, 35512, 43463, 63499}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {291827507};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.combineMeasuredStates(0, 0) + 1726, 29 - View.resolveSizeAndState(0, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 247010991, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                int iRed = 1755 - Color.red(0);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                byte b8 = (byte) 52;
                Object[] objArr25 = new Object[1];
                c(b8, b8, $$a[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionChild2, iRed, iIndexOf2, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{19561, 11050, 23764, 56977, 38673, 57152, 65122, 11251, 43108, 19944, 1906, 19374, 12509, 43513, 47065, 13744, 45386, 58869, 21749, 49201, 6503, 32820, 18005, 42162}, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{56395, 41676, 12926, 60067, 41681, 54751, 1534, 3074, 35574, 1381, 6695, 62042, 35263, 12970, 3700, 32681, 25266, 17239}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetAfter3 = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int iAlpha = 1755 - Color.alpha(0);
                    int offsetAfter4 = 23 - TextUtils.getOffsetAfter("", 0);
                    Object[] objArr28 = new Object[1];
                    c((byte) 52, (short) ($$b + 3), $$a[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetAfter3, iAlpha, offsetAfter4, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int deadChar2 = 23 - KeyEvent.getDeadChar(0, 0);
                    Object[] objArr29 = new Object[1];
                    c((byte) 37, (short) 104, $$a[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(deadChar, iIndexOf3, deadChar2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArrB$7879113[1])[0];
        int i30 = ((int[]) objArrB$7879113[0])[0];
        if (i30 != i29) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$7879113[4];
            if (strArr4 != null) {
                int i31 = d + 55;
                asBinder = i31 % 128;
                int i32 = i31 % 2;
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i30));
        }
        int i33 = ((int[]) objArrB$7879113[3])[0];
        int i34 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr30 = {new int[]{i34}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i35 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1071627512;
        int i36 = ~i35;
        int i37 = i33 + ((((~(i36 | (-222811205))) | ((~((-435413631) | i36)) | 155435076)) * (-397)) - 2043326164) + ((i35 | (-347354683)) * 397);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr30[3])[0] = i39 ^ (i39 << 5);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 83;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = $10 + 9;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 33;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) f608a) ^ 8611973335120459638L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 47725);
                        int scrollDefaultDelay = 468 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, scrollDefaultDelay, packedPositionType, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i13 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(g)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 47773), ((Process.getThreadPriority(0) + 20) >> 6) + 468, 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i13 + 1;
                    c = 0;
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
                byte b2 = (byte) (b - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2323 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1312321721, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e2, code lost:
    
        if (r1 != ((((~((-3154049) | r2)) * 521) - 845568086) + (((~((~r2) | (-3154049))) | 1627427874) * 521))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e4, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.program.jpn.JpnMainActivity.asBinder + 103;
        com.bpjstku.presentation.program.jpn.JpnMainActivity.d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f0, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f3, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f8, code lost:
    
        r1 = 1946248646 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0101, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006d, code lost:
    
        if (r1 == ((((-539685656) + ((~(324861930 | r7)) * (-560))) + ((~(r6 | 1474166763)) * (-560))) + (((~((-1154849474) | r7)) | 5544640) * 560))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a3, code lost:
    
        if (r1 == ((((-22730376) + (((~((~r6) | 1845289040)) | 268436777) * 446)) + (((~(r6 | 2113725817)) | 746864720) * 446)) - 536281746)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnMainActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1006989316
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnMainActivity.onStart():void");
    }

    public static /* synthetic */ CameraDeviceStateCallbacksComboDeviceStateCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(final JpnMainActivity jpnMainActivity) {
        int i = 2 % 2;
        String string = jpnMainActivity.getString(R.string.label_jp_simulation_menu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = jpnMainActivity.getString(R.string.label_jp_simulation_description);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CameraDeviceStateCallbacksComboDeviceStateCallback cameraDeviceStateCallbacksComboDeviceStateCallback = new CameraDeviceStateCallbacksComboDeviceStateCallback(jpnMainActivity, CollectionsKt.mutableListOf(new JpnMenu(1, string, string2, R.drawable.ic_jp_simulation)), new Function1() { // from class: getProfilesInternal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnMainActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (JpnMenu) obj);
            }
        });
        int i2 = asBinder + 109;
        d = i2 % 128;
        int i3 = i2 % 2;
        return cameraDeviceStateCallbacksComboDeviceStateCallback;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(JpnMainActivity jpnMainActivity, JpnMenu jpnMenu) {
        String str;
        int i = 2 % 2;
        int i2 = d + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jpnMenu, "");
        if (i3 != 0) {
            int i4 = jpnMenu.b;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (jpnMenu.b == TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            JpnSimulationActivity.Companion companion = JpnSimulationActivity.INSTANCE;
            JpnSimulationActivity.Companion.TuitionPaymentFragmentbindingInflater1(jpnMainActivity);
            int i5 = asBinder + 89;
            d = i5 % 128;
            int i6 = i5 % 2;
            str = "view_jpn_simulation";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_jpn_simulation", str));
        Intrinsics.checkNotNullParameter(jpnMainActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws IllegalAccessException {
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 39418311, -273322165, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 296742579 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 417268245, new Object[]{this}, 273322167);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1010527395, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, 1010527396);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b((-1602975600) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).codePointAt(1), -1400592156, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this, bundle}, 1400592156);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = asBinder + 31;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = (char) 24965;
        g = (char) 28747;
        f608a = (char) 35493;
        asInterface = (char) 30401;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 59;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.presentation.program.jpn.JpnMainActivity.$$c
            int r6 = r6 * 2
            int r6 = r6 + 108
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnMainActivity.$$i(int, int, int):java.lang.String");
    }
}
