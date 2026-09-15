package com.bpjstku.presentation.openbanking;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.openbanking.model.ListBank;
import com.bpjstku.databinding.ActivityListBankBinding;
import com.bpjstku.databinding.ItemVocationalTrainingRegionBinding;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.openbanking.ListBankActivity;
import com.bpjstku.util.constant.CodeBank;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.getMaxImages;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isAssociatedWith;
import defpackage.runExtraCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\f\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/openbanking/ListBankActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityListBankBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LrunExtraCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListBankActivity extends BindingBaseActivity<ActivityListBankBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long b;
    private static int d;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: TrustedWebActivityDisplayModeImmersiveMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ListBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });
    private static final byte[] $$a = {93, -77, 2, Base64.padSymbol, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 7;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~(i6 | i4);
        int i10 = i7 | (~i4);
        int i11 = i9 | (~(i10 | i2));
        int i12 = (~i2) | i10;
        int i13 = i6 + i4 + i + (770105990 * i3) + ((-157043368) * i5);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i6) - 1432092672) + ((-1000312294) * i4) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i) + ((-2121269248) * i3) + (1950351360 * i5) + ((-66846720) * i14);
        int i16 = (i6 * 105828664) + 1394048361 + (i4 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i * 105828275) + (i3 * (-227623502)) + (i5 * 619312264) + (i14 * 1925971968);
        int i17 = i15 + (i16 * i16 * 261881856);
        if (i17 != 1) {
            return i17 != 2 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 1
            int r8 = 145 - r8
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r0 = com.bpjstku.presentation.openbanking.ListBankActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r9 = r9 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.openbanking.ListBankActivity.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.openbanking.ListBankActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/openbanking/ListBankActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) ListBankActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            ListBankActivity$bindingInflater$1 listBankActivity$bindingInflater$1 = ListBankActivity$bindingInflater$1.b;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ListBankActivity$bindingInflater$1 listBankActivity$bindingInflater$2 = ListBankActivity$bindingInflater$1.b;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return listBankActivity$bindingInflater$2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final ListBankActivity listBankActivity = (ListBankActivity) objArr[0];
        int i = 2 % 2;
        ((ActivityListBankBinding) ((ViewBinding) listBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: TrustedWebActivityCallback
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        runExtraCallback runextracallback = (runExtraCallback) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String strOnReceiveResult = getMaxImages.onReceiveResult();
        String code = CodeBank.BRI.getCode();
        String string = getString(R.string.label_bank_bri);
        Intrinsics.checkNotNullExpressionValue(string, "");
        runextracallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.listOf(new ListBank(code, string, null, 2131230997, strOnReceiveResult, 4, null)));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1(((ActivityListBankBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityListBankBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.label_open_banking));
        RecyclerView recyclerView = ((ActivityListBankBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvListBank;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setAdapter((runExtraCallback) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.getOffsetBefore("", 0)), KeyEvent.getDeadChar(0, 0) + 2624, 13 - View.MeasureSpec.getMode(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39422), 480 - TextUtils.lastIndexOf("", '0', 0), 37 - View.resolveSize(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 21;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39423), 481 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0)), 481 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
            int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 141, $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionType, threadPriority, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{57749, 9333, 27214, 45131, 63015, 15414, 16906, 34899, 52963, 5344, 23180, 24802, 42681, 60580, 12946, 30864, 49001, 50536, 2902, 20774, 38715, 56580}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).length() + 50669, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{57745, 18777, 45079, 7111, 17027, 43604, 5398, 31969, 42905, 3932, 30226, 41419, 2193, 28756, 56095}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 43155, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int i2 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iResolveSize = 15 - View.resolveSize(0, 0);
            Object[] objArr5 = new Object[1];
            c((byte) 52, (short) 89, $$a[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i2, iResolveSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 37), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, edgeSlop, iIndexOf, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app).substring(26, 27).length() - 1371230369;
            int i5 = ~length;
            int i6 = (-353153590) + ((1040879827 | i5) * (-757)) + ((~(1065072123 | length)) * 1514) + (((~(length | (-24192297))) | (~(i5 | 796599657)) | 268472466) * 757) + 952716874;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{57758, 59348, 60672, 62294, 63710, 65245, 50195, 51805, 54171, 55699, 57133, 42310, 43659, 45261, 46623, 48214}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1565, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{57757, 56247, 38367, 20463, 2332, 50014, 48490, 30364, 12420, 60106, 41985, 40497, 22627, 4704, 53170, 35288}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 14887, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1628168607};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1134, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 952716874, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                    int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, (short) 141, $$a[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i9, absoluteGravity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1117 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "");
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int iMakeMeasureSpec2 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 37), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, iMakeMeasureSpec, iMakeMeasureSpec2, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{57749, 9333, 27214, 45131, 63015, 15414, 16906, 34899, 52963, 5344, 23180, 24802, 42681, 60580, 12946, 30864, 49001, 50536, 2902, 20774, 38715, 56580}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.done).substring(4, 5).codePointAt(0) + 50556, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{57745, 18777, 45079, 7111, 17027, 43604, 5398, 31969, 42905, 3932, 30226, 41419, 2193, 28756, 56095}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gb_t_ev_connector_type).substring(0, 4).codePointAt(1) + 43135, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                        int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, (short) 89, $$a[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, edgeSlop2, iCombineMeasuredStates, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, (short) 141, $$a[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, iArgb, iResolveSizeAndState, 1357589585, false, (String) objArr17[0], null);
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
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i17 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i18 = i14 + (((644797189 + (((~((-25249049) | i17)) | 269529218) * (-828))) + ((i17 | (-25249049)) * (-828))) - 568624736);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i21 = 0;
                while (i21 < strArr3.length) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                    TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                    if (i22 % 2 == 0) {
                        arrayList.add(strArr3[i21]);
                        i21 += 67;
                    } else {
                        arrayList.add(strArr3[i21]);
                        i21++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[3])[0];
            int i25 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i26 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i27 = ~(315031604 | i26);
            int i28 = ~i26;
            int i29 = i27 | (~(559311774 | i28));
            int i30 = ~((-315031605) | i28);
            int i31 = i23 + 54662685 + ((i29 | i30) * (-516)) + (((~(i26 | (-554724235))) | (~((-4587541) | i28))) * 516) + ((4587540 | i30) * 516);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
            int iResolveSizeAndState2 = 1755 - View.resolveSizeAndState(0, 0, 0);
            int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b6 = (byte) 37;
            Object[] objArr20 = new Object[1];
            c(b6, b6, $$a[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iResolveSizeAndState2, fadingEdgeLength, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentbindingInflater1 = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                int iGreen = 1755 - Color.green(0);
                int i36 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                Object[] objArr21 = new Object[1];
                c((byte) 52, (short) 89, $$a[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveOpacity, iGreen, i36, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i37 = (-353968827) + (((~(174850013 | iIdentityHashCode)) | 37752412) * (-756)) + (((~iIdentityHashCode) | 174850013) * 756) + 1396603951;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{57758, 59348, 60672, 62294, 63710, 65245, 50195, 51805, 54171, 55699, 57133, 42310, 43659, 45261, 46623, 48214}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1565, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{57757, 56247, 38367, 20463, 2332, 50014, 48490, 30364, 12420, 60106, 41985, 40497, 22627, 4704, 53170, 35288}, 14887 - TextUtils.getOffsetAfter("", 0), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1628168607};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 42049), 1727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1396603951);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                int i40 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iResolveSizeAndState3 = 23 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr26 = new Object[1];
                c((byte) 52, (short) 89, $$a[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf2, i40, iResolveSizeAndState3, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{57749, 9333, 27214, 45131, 63015, 15414, 16906, 34899, 52963, 5344, 23180, 24802, 42681, 60580, 12946, 30864, 49001, 50536, 2902, 20774, 38715, 56580}, ExpandableListView.getPackedPositionChild(0L) + 50672, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{57745, 18777, 45079, 7111, 17027, 43604, 5398, 31969, 42905, 3932, 30226, 41419, 2193, 28756, 56095}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_2).substring(10, 11).length() + 43200, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                    int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr = $$a;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, bArr[7], bArr[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAxisFromString, iIndexOf2, packedPositionGroup, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1755;
                    int i41 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b7 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    c(b7, b7, $$a[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRgb, deadChar2, i41, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i43 == i42) {
            int i44 = TuitionPaymentFragmentbindingInflater1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i44 % 128;
            int i45 = i44 % 2;
            int i46 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i48 = ~i47;
            int i49 = i46 + 2145445872 + (((~(i48 | (-221179843))) | 433782268) * (-1042)) + (((-221179843) | i47) * 521) + (((~(i47 | (-433782269))) | 282071100 | (~(i48 | (-69468675)))) * 521);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
            int i52 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i52 % 128;
            int i53 = i52 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr5 != null) {
            for (String str : strArr5) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i43];
        int i54 = i43 - 1;
        iArr[i54] = 1;
        Toast.makeText((Context) null, iArr[((i43 * i54) % 2) - 1], 1).show();
        int i55 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iMyPid = Process.myPid();
        int i56 = (-1083305473) + (((~((-504178875) | iMyPid)) | 268503168 | (~((-291576449) | iMyPid))) * (-754));
        int i57 = ~((-268503169) | iMyPid);
        int i58 = ~iMyPid;
        int i59 = i55 + i56 + ((i57 | (~((-23073281) | i58))) * (-754)) + ((i58 | (-504178875)) * 754);
        int i60 = (i59 << 13) ^ i59;
        int i61 = i60 ^ (i60 >>> 17);
        ((int[]) objArr32[3])[0] = i61 ^ (i61 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2093640362
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r9) {
        /*
            r0 = 0
            r9 = r9[r0]
            com.bpjstku.presentation.openbanking.ListBankActivity r9 = (com.bpjstku.presentation.openbanking.ListBankActivity) r9
            r1 = 2
            int r2 = r1 % r1
            java.lang.reflect.Member[] r2 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 0
            int r2 = r2.getInt(r3)
            int r4 = android.os.Process.myUid()
            r5 = -1559168184(0xffffffffa310fb48, float:-7.8594665E-18)
            r6 = r4 | r5
            int r6 = r6 * 140
            r7 = 951481576(0x38b674e8, float:8.700212E-5)
            int r7 = r7 + r6
            int r6 = ~r4
            r5 = r5 | r6
            int r5 = ~r5
            r8 = 140902560(0x86600a0, float:6.921384E-34)
            r5 = r5 | r8
            int r5 = r5 * (-280)
            int r7 = r7 + r5
            r5 = 729180640(0x2b7669e0, float:8.754369E-13)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = -2147446264(0xffffffff80009208, float:-5.2386E-41)
            r5 = r5 | r6
            r6 = -140902561(0xfffffffff799ff5f, float:-6.2468825E33)
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 140
            int r7 = r7 + r4
            if (r2 != r7) goto Lbc
            java.lang.reflect.Member[] r2 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            r5 = 2011251723(0x77e1440b, float:9.137866E33)
            int r4 = r4.nextInt(r5)
            int r5 = ~r4
            r6 = -226291721(0xfffffffff2830ff7, float:-5.191915E30)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 205279232(0xc3c5000, float:1.4507067E-31)
            r6 = r6 | r7
            r7 = -1921190564(0xffffffff8d7cf55c, float:-7.7948836E-31)
            r4 = r4 | r7
            int r4 = ~r4
            r6 = r6 | r4
            int r6 = r6 * (-502)
            r7 = -1744951972(0xffffffff97fe255c, float:-1.6423796E-24)
            int r7 = r7 + r6
            r6 = -21012489(0xfffffffffebf5ff7, float:-1.2719041E38)
            r5 = r5 | r6
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 502
            int r7 = r7 + r4
            if (r2 == r7) goto La9
            int r2 = com.bpjstku.presentation.openbanking.ListBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r2 = r2 + 59
            int r4 = r2 % 128
            com.bpjstku.presentation.openbanking.ListBankActivity.TuitionPaymentFragmentbindingInflater1 = r4
            int r2 = r2 % r1
            r4 = -1
            r5 = -2093640363(0xffffffff83359555, float:-5.3362544E-37)
            r6 = -2093640362(0xffffffff83359556, float:-5.336255E-37)
            r7 = 1
            if (r2 != 0) goto L98
            int[] r2 = new int[r6]
            r2[r5] = r0
            r0 = r2[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r7)
            r0.show()
            goto La9
        L98:
            int[] r0 = new int[r6]
            r0[r5] = r7
            r2 = -1383881842(0xffffffffad83a38e, float:-1.4965609E-11)
            int r2 = r2 % r1
            r0 = r0[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r7)
            r0.show()
        La9:
            super.onResume()
            int r9 = com.bpjstku.presentation.openbanking.ListBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r9 = r9 + 25
            int r0 = r9 % 128
            com.bpjstku.presentation.openbanking.ListBankActivity.TuitionPaymentFragmentbindingInflater1 = r0
            int r9 = r9 % r1
            if (r9 == 0) goto Lb8
            return r3
        Lb8:
            r3.hashCode()
            throw r3
        Lbc:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.openbanking.ListBankActivity.b(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1749782772;
            int i4 = ~iCodePointAt;
            if (i3 != (-1821098280) + (((~(1828490205 | i4)) | (-998502663) | (~((-1828490206) | iCodePointAt))) * (-564)) + ((~(iCodePointAt | (-679510277))) * 1128) + (((~((-998502663) | i4)) | 1148979929) * 564)) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 385470108;
            if (i5 != 1512020452 + (((~(1469699419 | i6)) | (-639711877)) * (-964)) + (((~((~i6) | 1469699419)) | (-2008678368)) * (-964))) {
                throw null;
            }
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = 532564860 + ((iIdentityHashCode | 152371574) * (-50));
        int i9 = ~((-262503) | iIdentityHashCode);
        int i10 = ~iIdentityHashCode;
        if (i7 != i8 + ((i9 | (~(1868545407 | i10))) * 50) + (((~(i10 | 152371574)) | (~(1868282905 | i10)) | (-1868545408)) * 50)) {
            int i11 = (-1255536024) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 6 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -204297737
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.openbanking.ListBankActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListBankActivity listBankActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            listBankActivity.finish();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(ListBankActivity listBankActivity, ListBank listBank) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listBank, "");
        TncBankActivity.Companion companion = TncBankActivity.INSTANCE;
        TncBankActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listBankActivity, listBank);
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ runExtraCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(final ListBankActivity listBankActivity) {
        int i = 2 % 2;
        runExtraCallback runextracallback = new runExtraCallback(listBankActivity, null, new Function1() { // from class: TrustedWebActivityDisplayMode
            private static final byte[] $$a = {91, -17, 90, 37};
            private static final int $$b = 173;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 7527745389655103945L;
            private static long TuitionPaymentFragmentbindingInflater1 = 1669471154651139719L;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unitB;
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 != 0) {
                    unitB = ListBankActivity.b(this.b, (ListBank) obj);
                    int i4 = 10 / 0;
                } else {
                    unitB = ListBankActivity.b(this.b, (ListBank) obj);
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return unitB;
            }

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i2);
                abortcapture.b = 4;
                int i4 = $11 + 117;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (abortcapture.b < cArrB.length) {
                    int i6 = $10 + 105;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i8 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 64839), Process.getGidForName("") + 1357, 38 - TextUtils.getCapsMode("", 0, 0), 894276454, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47773), 468 - (ViewConfiguration.getScrollBarSize() >> 8), MotionEvent.axisFromString("") + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
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

            /* JADX WARN: Code duplicated, block: B:43:0x0190  */
            /* JADX WARN: Code duplicated, block: B:44:0x0191  */
            private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
                Object obj;
                Throwable cause;
                int i3 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (true) {
                    obj = null;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i4 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.indexOf("", "", 0, 0)), View.getDefaultSize(0, 0) + 2624, (ViewConfiguration.getTapTimeout() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39422), 480 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i5 = $11 + 107;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        try {
                            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39423), View.MeasureSpec.getSize(0) + 481, 36 - TextUtils.indexOf((CharSequence) "", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 39423), Color.alpha(0) + 481, ExpandableListView.getPackedPositionChild(0L) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                int i6 = $10 + 83;
                $11 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i2, int i3) {
                int i4;
                Object[] objArr;
                char[] cArr;
                int defaultSize;
                int i5;
                int i6;
                char c;
                int i7;
                int i8 = 2 % 2;
                int i9 = 1;
                if (context != null) {
                    try {
                        char[] cArr2 = {63624, 37600, 45588, 48817, 63691, 24833, 21879, 26109, 13914, 20719, 1148, 5911, 26009, 931, 14050, 50800, 38105, 52577, 57843, 63895, 49748, 48176, 36967, 43789, 61770, 28639, 17260, 23143, 8329, 24211, 3582, 3463, 24465, 2150, 15557};
                        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i11 = i10 + 105;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                        int i12 = i11 % 2 != 0 ? (375 >> scrollDefaultDelay) >> (-747) : (scrollDefaultDelay * 375) - 747;
                        int i13 = ~scrollDefaultDelay;
                        int i14 = ~(i13 | 1);
                        int i15 = ~i2;
                        int i16 = ~((i15 ^ scrollDefaultDelay) | (i15 & scrollDefaultDelay));
                        int i17 = (i12 - (~(((i14 ^ i16) | (i14 & i16)) * (-374)))) - 1;
                        int i18 = (i10 & 21) + (i10 | 21);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i19 = -(-(~(((-2) ^ scrollDefaultDelay) | (scrollDefaultDelay & (-2)))));
                            i4 = i17 + (i19 & 748) + (i19 | 748);
                        } else {
                            int i20 = -(-((~(((-2) ^ scrollDefaultDelay) | (scrollDefaultDelay & (-2)))) * 748));
                            i4 = (i17 & i20) + (i20 | i17);
                        }
                        int i21 = ~(i13 | (-2));
                        int i22 = ((i10 | 83) << 1) - (i10 ^ 83);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                        int i23 = i22 % 2;
                        int i24 = -(-((i21 | i16) * 374));
                        int i25 = (i4 ^ i24) + ((i24 & i4) << 1);
                        Object[] objArr2 = new Object[1];
                        a(cArr2, i25, objArr2);
                        String str = (String) objArr2[0];
                        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        int i27 = i26 % 2;
                        try {
                            Object[] objArr3 = {str};
                            char[] cArr3 = {42998, 43446, 47996, 36124, 40648, 57541, 61997, 50164, 54695, 10058, 10496, 15052, 3180, 7722, 28584, 29080, 17241, 21779, 42674, 43043, 47672, 35726, 40414, 61201, 61626, 49815, 54327, 9797, 14232, 14771, 2852, 7392, 28306, 28756, 16899, 21421, 42353, 46887};
                            int iResolveSize = View.resolveSize(0, 0);
                            int i28 = ~iResolveSize;
                            int i29 = (i28 & (-3660)) | (i28 ^ (-3660));
                            int i30 = (~((i29 & i15) | (i29 ^ i15))) | (~(iResolveSize | 3659));
                            int i31 = ~((i2 & 3659) | (i2 ^ 3659));
                            int i32 = ((iResolveSize * 69) - 245153) + (((i30 & i31) | (i30 ^ i31)) * (-68));
                            int i33 = ~iResolveSize;
                            int i34 = ~i2;
                            int i35 = (i33 & i34) | (i33 ^ i34);
                            int i36 = (~((i35 & 3659) | (i35 ^ 3659))) * (-68);
                            int i37 = (i32 ^ i36) + ((i36 & i32) << 1);
                            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                            int i39 = i38 % 2;
                            int i40 = ~(((-3660) & i15) | ((-3660) ^ i15));
                            int i41 = 68 * ((i40 & i28) | (i28 ^ i40));
                            int i42 = (i37 & i41) + (i37 | i41);
                            Object[] objArr4 = new Object[1];
                            c(cArr3, i42, objArr4);
                            Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                            Object[] objArr5 = new Object[1];
                            a(new char[]{30791, 50509, 46691, 5664, 30724, 14047, 20840, 52606, 46807, 1897, 'D', 49064, 58705, 21518, 12999, 28362, 5146, 39626, 58845, 20770, 17145, 60399, 37996, 947, 29071, 14436, 18182, 62192, 41035, 2426, 2529, 42288, 57089, 24555, 14470}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
                            try {
                                Object[] objArr6 = {(String) objArr5[0]};
                                int i43 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i44 = ((i43 | 3658) << 1) - (i43 ^ 3658);
                                Object[] objArr7 = new Object[1];
                                c(new char[]{42998, 43446, 47996, 36124, 40648, 57541, 61997, 50164, 54695, 10058, 10496, 15052, 3180, 7722, 28584, 29080, 17241, 21779, 42674, 43043, 47672, 35726, 40414, 61201, 61626, 49815, 54327, 9797, 14232, 14771, 2852, 7392, 28306, 28756, 16899, 21421, 42353, 46887}, i44, objArr7);
                                Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                                int i45 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i46 = (i45 ^ 35) + ((i45 & 35) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i46 % 128;
                                int i47 = i46 % 2;
                                int i48 = (i45 ^ 29) + ((i45 & 29) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i48 % 128;
                                int i49 = i48 % 2;
                                try {
                                    int i50 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int i51 = i50 * 371;
                                    int i52 = (i51 & 371) + (i51 | 371);
                                    int i53 = ~(((-2) ^ i15) | ((-2) & i15));
                                    int i54 = ~i50;
                                    int i55 = ~((i54 ^ i2) | (i54 & i2));
                                    int i56 = -(-(((i53 & i55) | (i53 ^ i55)) * (-370)));
                                    int i57 = (i52 & i56) + (i56 | i52);
                                    int i58 = ~(i54 | i34);
                                    int i59 = ~((-2) | i2);
                                    int i60 = ((i57 - (~((((i58 & i59) | (i58 ^ i59)) | (~(i50 | 1))) * (-370)))) - 1) + ((~((i50 ^ 1) | (i50 & 1))) * 370);
                                    Object[] objArr8 = new Object[1];
                                    a(new char[]{57955, 56310, 23538, 24408, 57858, 10295, 48328, 33831, 11440, 6644, 60812, 63167, 32632, 19134, 57162, 10153, 36402, 33915, 2068, 6199, 55504, 62726, 31186, 19153, 60330, 9941, 43660}, i60, objArr8);
                                    Class<?> cls = Class.forName((String) objArr8[0]);
                                    int i61 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                    int i62 = (i61 & 11658) + (i61 | 11658);
                                    Object[] objArr9 = new Object[1];
                                    c(new char[]{43003, 35440, 64762, 12119, 4569, 17490, 46785, 39234, 52147, 15912, 24715, 21278, 34206, 59400, 55941, 3326, 32638}, i62, objArr9);
                                    Object objInvoke = cls.getMethod((String) objArr9[0], null).invoke(context, null);
                                    int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i64 = ((i63 | 73) << 1) - (i63 ^ 73);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i64 % 128;
                                    if (i64 % 2 == 0) {
                                        int i65 = 3 % 3;
                                    }
                                    try {
                                        int i66 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                        int i67 = (i66 ^ 1) + ((i66 & 1) << 1);
                                        Object[] objArr10 = new Object[1];
                                        a(new char[]{57955, 56310, 23538, 24408, 57858, 10295, 48328, 33831, 11440, 6644, 60812, 63167, 32632, 19134, 57162, 10153, 36402, 33915, 2068, 6199, 55504, 62726, 31186, 19153, 60330, 9941, 43660}, i67, objArr10);
                                        Class<?> cls2 = Class.forName((String) objArr10[0]);
                                        Object[] objArr11 = new Object[1];
                                        a(new char[]{2865, 61478, 16632, 45890, 2902, 1004, 42962, 26655, 50668, 12846, 63113, 6890, 38446, 24932, 50272, 52134, 26472, 44960}, View.combineMeasuredStates(0, 0) + 1, objArr11);
                                        Object objInvoke2 = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                        int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                                        int i69 = i68 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i69;
                                        int i70 = i68 % 2;
                                        int i71 = i69 + 81;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i71 % 128;
                                        int i72 = i71 % 2;
                                        try {
                                            Object[] objArr12 = {objInvoke2, 64};
                                            char[] cArr4 = {38570, 50843, 52750, 29723, 38603, 13658, 10548, 44900, 22649, 1177, 30832, 56828, 2993, 22483, 19126, 3306, 64251, 39190, 40424, 13172, 44074, 59497, 60526, 25014, 40807, 15267, 16239, 37059, 20133, 2793, 29061, 50959, 12768, 23593, 16619, 63055, 58168};
                                            int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                            int i73 = (maxKeyCode * (-947)) + 949;
                                            int i74 = ~maxKeyCode;
                                            int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i75 % 128;
                                            int i76 = i75 % 2;
                                            int i77 = (-2) | i2;
                                            int i78 = ~i77;
                                            int i79 = (-948) * ((i74 ^ i78) | (i78 & i74));
                                            int i80 = ((i73 | i79) << 1) - (i73 ^ i79);
                                            int i81 = ~maxKeyCode;
                                            int i82 = (i81 & (-2)) | (i81 ^ (-2));
                                            int i83 = -(-((~((i82 & i15) | (i82 ^ i15))) * (-948)));
                                            int i84 = ((i80 | i83) << 1) - (i80 ^ i83);
                                            int i85 = -(-(((maxKeyCode ^ (-2)) | (maxKeyCode & (-2))) * 948));
                                            int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                                            Object[] objArr13 = new Object[1];
                                            a(cArr4, i86, objArr13);
                                            Class<?> cls3 = Class.forName((String) objArr13[0]);
                                            int i87 = -TextUtils.getTrimmedLength("");
                                            int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                                            int i88 = i87 * 465;
                                            int i89 = (i88 ^ (-25255261)) + ((i88 & (-25255261)) << 1);
                                            int i90 = ~iTuitionPaymentFragmentbindingInflater1;
                                            int i91 = (~(((-54548) ^ i87) | ((-54548) & i87))) | (~(((-54548) ^ i90) | ((-54548) & i90)));
                                            int i92 = ~iTuitionPaymentFragmentbindingInflater1;
                                            int i93 = ~((i92 ^ i87) | (i92 & i87));
                                            int i94 = ((i91 ^ i93) | (i91 & i93)) * 464;
                                            int i95 = (i89 & i94) + (i89 | i94);
                                            int i96 = ~i87;
                                            int i97 = (iTuitionPaymentFragmentbindingInflater1 ^ i96) | (i96 & iTuitionPaymentFragmentbindingInflater1);
                                            int i98 = -(-(((i97 ^ (-54548)) | (i97 & (-54548))) * (-464)));
                                            int i99 = ((i95 | i98) << 1) - (i98 ^ i95);
                                            int i100 = ~(((-54548) ^ i87) | ((-54548) & i87));
                                            int i101 = ~((i87 & iTuitionPaymentFragmentbindingInflater1) | (i87 ^ iTuitionPaymentFragmentbindingInflater1));
                                            int i102 = i99 + (((i100 & i101) | (i100 ^ i101)) * 464);
                                            Object[] objArr14 = new Object[1];
                                            c(new char[]{43003, 29418, 3534, 55541, 62385, 36512, 22917, 29816, 3939, 55890, 62827, 32803, 23326, 30212}, i102, objArr14);
                                            Method method = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE);
                                            int i103 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i104 = (i103 ^ 95) + ((i103 & 95) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i104 % 128;
                                            int i105 = i104 % 2;
                                            Object objInvoke3 = method.invoke(objInvoke, objArr12);
                                            int iGreen = Color.green(0);
                                            int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                                            int i106 = iGreen * (-575);
                                            int i107 = ((i106 | (-575)) << 1) - (i106 ^ (-575));
                                            int i108 = ~iGreen;
                                            int i109 = ~((i108 ^ (-2)) | (i108 & (-2)));
                                            int i110 = ~(((-2) ^ iTuitionPaymentFragmentbindingInflater2) | ((-2) & iTuitionPaymentFragmentbindingInflater2));
                                            int i111 = (i107 - (~(-(-(((i109 ^ i110) | (i109 & i110)) * 576))))) - 1;
                                            int i112 = ~((i108 ^ 1) | (i108 & 1));
                                            int i113 = (~iTuitionPaymentFragmentbindingInflater2) | (-2);
                                            int i114 = ~((i113 & iGreen) | (i113 ^ iGreen));
                                            int i115 = ((i114 & i112) | (i112 ^ i114)) * 576;
                                            int i116 = (i111 ^ i115) + ((i115 & i111) << 1);
                                            int i117 = -(-((~(i108 | (-2))) * 576));
                                            int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                                            Object[] objArr15 = new Object[1];
                                            a(new char[]{43799, 514, 19106, 30091, 43894, 61891, 44440, 44788, 26052, 49152, 64732, 56428, 13836, 37706, 52762, 3450, 51014, 23951, 6468, 13028, 37271, 11504, 26818, 24614, 41690, 65338, 48067, 37203, 29464, 52848, 62765, 50832, 3157, 39102}, i118, objArr15);
                                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                            int i119 = iIndexOf * 375;
                                            int i120 = ((i119 | (-8934120)) << 1) - (i119 ^ (-8934120));
                                            int i121 = ~iIndexOf;
                                            int i122 = (i120 - (~(((~((i121 ^ 11960) | (i121 & 11960))) | (~((i34 ^ iIndexOf) | (i34 & iIndexOf)))) * (-374)))) - 1;
                                            int i123 = -(-((~((-11961) | iIndexOf)) * 748));
                                            int i124 = ~(i121 | (-11961));
                                            int i125 = ~((iIndexOf & i15) | (i15 ^ iIndexOf));
                                            int i126 = (i122 ^ i123) + ((i122 & i123) << 1) + (((i125 & i124) | (i124 ^ i125)) * 374);
                                            Object[] objArr16 = new Object[1];
                                            c(new char[]{42991, 35138, 64149, 11223, 7457, 20091, 49059, 57583, 53825, 896}, i126, objArr16);
                                            Object[] objArr17 = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke3);
                                            int length = objArr17.length;
                                            int i127 = 0;
                                            while (true) {
                                                if (i127 < length) {
                                                    Object obj = objArr17[i127];
                                                    int i128 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i129 = (i128 & 1) + (i128 | i9);
                                                    Object[] objArr18 = new Object[i9];
                                                    a(new char[]{16292, 16043, 3490, 25708, 16380, 52522, 60105, 48977, 61729}, i129, objArr18);
                                                    String str2 = (String) objArr18[0];
                                                    int i130 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i131 = ((i130 | 55) << i9) - (i130 ^ 55);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i131 % 128;
                                                    if (i131 % 2 != 0) {
                                                        try {
                                                            objArr = new Object[i9];
                                                            objArr[i9] = str2;
                                                            cArr = new char[]{42998, 4114, 51252, 32816, 30734, 12356, 59491, 41078, 6289, 53385, 34979, 16557, 14545, 61585, 43245, 24824, 55582, 37175, 18812, 354, 63829, 45429, 26978, 8588, 39314, 20898, 2489, 49608, 47564, 29162, 10712, 57868, 23071, 4647, 51789, 33347, 31353};
                                                            defaultSize = 47087 / View.getDefaultSize(i9, i9);
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        objArr = new Object[]{str2};
                                                        cArr = new char[]{42998, 4114, 51252, 32816, 30734, 12356, 59491, 41078, 6289, 53385, 34979, 16557, 14545, 61585, 43245, 24824, 55582, 37175, 18812, 354, 63829, 45429, 26978, 8588, 39314, 20898, 2489, 49608, 47564, 29162, 10712, 57868, 23071, 4647, 51789, 33347, 31353};
                                                        int i132 = -(-View.getDefaultSize(0, 0));
                                                        defaultSize = (i132 ^ 47087) + ((i132 & 47087) << i9);
                                                    }
                                                    Object[] objArr19 = new Object[i9];
                                                    c(cArr, defaultSize, objArr19);
                                                    Class<?> cls5 = Class.forName((String) objArr19[0]);
                                                    char[] cArr5 = {6866, 57450, 33510, 17399, 6837, 5024, 26060, 39091, 54272, 8818, 13448, 59999, 34756, 28974, 1621};
                                                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                    int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                                                    Object[] objArr20 = objArr17;
                                                    int i133 = (keyRepeatDelay * (-167)) - 167;
                                                    int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i135 = length;
                                                    int i136 = i134 + 65;
                                                    int i137 = i127;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i136 % 128;
                                                    int i138 = i136 % 2;
                                                    int i139 = ~keyRepeatDelay;
                                                    int i140 = ~((i139 & (-2)) | (i139 ^ (-2)));
                                                    int i141 = ~((-2) | iTuitionPaymentFragmentbindingInflater3);
                                                    int i142 = ((i140 ^ i141) | (i140 & i141)) * 336;
                                                    int i143 = (i133 ^ i142) + ((i133 & i142) << 1);
                                                    int i144 = ~((keyRepeatDelay ^ 1) | (keyRepeatDelay & 1));
                                                    int i145 = ~((keyRepeatDelay ^ iTuitionPaymentFragmentbindingInflater3) | (keyRepeatDelay & iTuitionPaymentFragmentbindingInflater3));
                                                    int i146 = ((i144 ^ i145) | (i144 & i145)) * (-168);
                                                    int i147 = (i143 ^ i146) + ((i146 & i143) << 1);
                                                    int i148 = ~iTuitionPaymentFragmentbindingInflater3;
                                                    int i149 = i134 + 123;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i149 % 128;
                                                    int i150 = i149 % 2;
                                                    int i151 = ~((i148 & keyRepeatDelay) | (i148 ^ keyRepeatDelay));
                                                    int i152 = 168 * ((i151 & (-2)) | ((-2) ^ i151));
                                                    int i153 = ((i147 | i152) << 1) - (i147 ^ i152);
                                                    Object[] objArr21 = new Object[1];
                                                    a(cArr5, i153, objArr21);
                                                    Object objInvoke4 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr);
                                                    try {
                                                        int iAxisFromString = MotionEvent.axisFromString("");
                                                        int i154 = ((iAxisFromString | 2130) << 1) - (iAxisFromString ^ 2130);
                                                        Object[] objArr22 = new Object[1];
                                                        c(new char[]{43005, 44963, 46938, 48925, 34487, 36448, 38430, 40325, 58743, 60714, 62680, 64659, 50229, 52207, 54150, 56077, 8956, 10896, 12800, 14796, 417, 2398, 4356, 6330, 24688, 26624, 32724, 18290}, i154, objArr22);
                                                        Class<?> cls6 = Class.forName((String) objArr22[0]);
                                                        char[] cArr6 = {214, 37790, 21713, 49622, Typography.cent, 24670, 46029, 6818, 52766, 20880, 57994, 26733, 40412, 728, 53374};
                                                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                        int i155 = (packedPositionGroup * 85) + 85;
                                                        int i156 = ~packedPositionGroup;
                                                        int i157 = ~((i156 ^ (-2)) | (i156 & (-2)));
                                                        int i158 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        Object obj2 = objNewInstance2;
                                                        int i159 = i158 + 69;
                                                        Object obj3 = objNewInstance;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i159 % 128;
                                                        if (i159 % 2 == 0) {
                                                            throw null;
                                                        }
                                                        int i160 = ~((i156 ^ i15) | (i156 & i15));
                                                        int i161 = (i160 & i157) | (i157 ^ i160);
                                                        int i162 = ~((-2) | i34);
                                                        int i163 = (i161 & i162) | (i161 ^ i162);
                                                        int i164 = (packedPositionGroup ^ 1) | (packedPositionGroup & 1);
                                                        int i165 = ~((i164 ^ i2) | (i164 & i2));
                                                        int i166 = ((i163 & i165) | (i163 ^ i165)) * (-84);
                                                        int i167 = ((i155 | i166) << 1) - (i166 ^ i155);
                                                        int i168 = ~i77;
                                                        int i169 = (i168 & packedPositionGroup) | (packedPositionGroup ^ i168);
                                                        int i170 = (i15 ^ 1) | (i15 & 1);
                                                        int i171 = ~i170;
                                                        int i172 = ((i169 & i171) | (i169 ^ i171)) * (-84);
                                                        int i173 = i158 + 21;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i173 % 128;
                                                        if (i173 % 2 == 0) {
                                                            i5 = i167 / i172;
                                                            int i174 = ~i170;
                                                            int i175 = ~i164;
                                                            i6 = (i174 & i175) | (i174 ^ i175);
                                                        } else {
                                                            int i176 = -(-i172);
                                                            i5 = ((i167 | i176) << 1) - (i176 ^ i167);
                                                            i6 = (~((i34 ^ 1) | (i34 & 1))) | (~i164);
                                                        }
                                                        Object[] objArr23 = new Object[1];
                                                        a(cArr6, i5 + (84 * i6), objArr23);
                                                        try {
                                                            Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr23[0], null).invoke(obj, null))};
                                                            char[] cArr7 = {42998, 4114, 51252, 32816, 30734, 12356, 59491, 41078, 6289, 53385, 34979, 16557, 14545, 61585, 43245, 24824, 55582, 37175, 18812, 354, 63829, 45429, 26978, 8588, 39314, 20898, 2489, 49608, 47564, 29162, 10712, 57868, 23071, 4647, 51789, 33347, 31353};
                                                            int i177 = -TextUtils.getTrimmedLength("");
                                                            int i178 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i178 % 128;
                                                            int i179 = i178 % 2;
                                                            int i180 = (i177 * (-500)) - 23543500;
                                                            int i181 = ~((-47088) | i177);
                                                            int i182 = ~i177;
                                                            int i183 = ~((i182 ^ 47087) | (i182 & 47087) | i2);
                                                            int i184 = ((i181 & i183) | (i181 ^ i183)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                            int i185 = (i180 ^ i184) + ((i180 & i184) << 1);
                                                            int i186 = ~i177;
                                                            int i187 = -(-((~((i186 & (-47088)) | (i186 ^ (-47088)))) * 1002));
                                                            int i188 = (i185 ^ i187) + ((i187 & i185) << 1);
                                                            int i189 = (i182 ^ i15) | (i182 & i15);
                                                            int i190 = -(-((~((i189 & 47087) | (i189 ^ 47087))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                            int i191 = (i188 ^ i190) + ((i190 & i188) << 1);
                                                            Object[] objArr25 = new Object[1];
                                                            c(cArr7, i191, objArr25);
                                                            Class<?> cls7 = Class.forName((String) objArr25[0]);
                                                            Object[] objArr26 = new Object[1];
                                                            c(new char[]{43003, 15190, 40620, 29172, 54610, 43158, 3058, 61232, 17063, 9694, 47416, 7277, 65473, 21273, 13927, 35262, 27917, 49271, 41911}, 40112 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr26);
                                                            String str3 = (String) objArr26[0];
                                                            Class<?>[] clsArr = new Class[1];
                                                            int i192 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i192 % 128;
                                                            int i193 = i192 % 2;
                                                            clsArr[0] = InputStream.class;
                                                            Object objInvoke5 = cls7.getMethod(str3, clsArr).invoke(objInvoke4, objArr24);
                                                            try {
                                                                int i194 = -(-Color.green(0));
                                                                int i195 = (i194 ^ 1) + ((i194 & 1) << 1);
                                                                Object[] objArr27 = new Object[1];
                                                                a(new char[]{11676, 23002, 63562, 43627, 11766, 43540, 8034, 28935, 58126, 39874, 20021, 961, 45201, 51343, 31989, 53914, 16849, 1559, 43963, 60751, 5918, 30513, 55850, 49102, 9221, 42161, 2425, 20113, 62865, 38335, 18424, 6519, 35550, 50016, 30379, 10299, 22536, 12336}, i195, objArr27);
                                                                Class<?> cls8 = Class.forName((String) objArr27[0]);
                                                                Object[] objArr28 = new Object[1];
                                                                a(new char[]{34223, 16550, 9539, 9283, 34248, 45932, 49769, 65309, 19302, 33455, 37683, 36335, 6324, 53749, 41421, 23795, 59819, 8053, 30337, 25456, 48950, 28247, 1902, 12759, 35955, 48540, 54309}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr28);
                                                                if (obj3.equals(cls8.getMethod((String) objArr28[0], null).invoke(objInvoke5, null))) {
                                                                    break;
                                                                }
                                                                int i196 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i196 % 128;
                                                                int i197 = i196 % 2;
                                                                try {
                                                                    int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                                    int i198 = scrollDefaultDelay2 * (-209);
                                                                    int i199 = (i198 & (-209)) + (i198 | (-209));
                                                                    int i200 = ~scrollDefaultDelay2;
                                                                    int i201 = -(-((~((i200 ^ (-2)) | (i200 & (-2)))) * 210));
                                                                    int i202 = (i199 ^ i201) + ((i199 & i201) << 1);
                                                                    int i203 = ~((-2) | i15);
                                                                    int i204 = ~scrollDefaultDelay2;
                                                                    int i205 = ~((i204 & i2) | (i204 ^ i2));
                                                                    int i206 = ((i203 & i205) | (i203 ^ i205)) * 210;
                                                                    int i207 = (i200 & i15) | (i200 ^ i15);
                                                                    int i208 = ~((i207 & 1) | (i207 ^ 1));
                                                                    int i209 = scrollDefaultDelay2 | (-2);
                                                                    int i210 = ~((i209 & i2) | (i209 ^ i2));
                                                                    int i211 = (((i202 ^ i206) + ((i206 & i202) << 1)) - (~(-(-(((i210 & i208) | (i208 ^ i210)) * 210))))) - 1;
                                                                    Object[] objArr29 = new Object[1];
                                                                    a(new char[]{11676, 23002, 63562, 43627, 11766, 43540, 8034, 28935, 58126, 39874, 20021, 961, 45201, 51343, 31989, 53914, 16849, 1559, 43963, 60751, 5918, 30513, 55850, 49102, 9221, 42161, 2425, 20113, 62865, 38335, 18424, 6519, 35550, 50016, 30379, 10299, 22536, 12336}, i211, objArr29);
                                                                    Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                    Object[] objArr30 = new Object[1];
                                                                    a(new char[]{34223, 16550, 9539, 9283, 34248, 45932, 49769, 65309, 19302, 33455, 37683, 36335, 6324, 53749, 41421, 23795, 59819, 8053, 30337, 25456, 48950, 28247, 1902, 12759, 35955, 48540, 54309}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr30);
                                                                    if (obj2.equals(cls9.getMethod((String) objArr30[0], null).invoke(objInvoke5, null))) {
                                                                        break;
                                                                    }
                                                                    i127 = ((i137 | 1) << 1) - (i137 ^ 1);
                                                                    objNewInstance = obj3;
                                                                    objArr17 = objArr20;
                                                                    i9 = 1;
                                                                    objNewInstance2 = obj2;
                                                                    length = i135;
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            }
                                            int i212 = (i2 & (-2)) | (i15 & 1);
                                            Object[] objArr31 = new Object[4];
                                            int[] iArr = new int[1];
                                            objArr31[0] = iArr;
                                            int[] iArr2 = new int[1];
                                            objArr31[1] = iArr2;
                                            int[] iArr3 = new int[1];
                                            objArr31[2] = iArr3;
                                            int i213 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                                            int i214 = i213 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i214;
                                            int i215 = i213 % 2;
                                            int i216 = (i214 & 97) + (i214 | 97);
                                            int i217 = i216 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i217;
                                            if (i216 % 2 != 0) {
                                                c = 0;
                                                iArr2[0] = i2;
                                            } else {
                                                c = 0;
                                                iArr[0] = i2;
                                            }
                                            iArr3[c] = i212;
                                            int i218 = (i217 & 59) + (i217 | 59);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i218 % 128;
                                            int i219 = i218 % 2;
                                            objArr31[3] = null;
                                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                            int i220 = ~iMaxMemory;
                                            int i221 = (~((-674953673) | i220)) | 538108352;
                                            int i222 = ~(iMaxMemory | 771488763);
                                            int i223 = 1775150704 + ((i221 | i222) * (-713)) + (i222 * 1426) + ((~(634643443 | i220)) * 713);
                                            int i224 = (i223 & 16) + (i223 | 16);
                                            int i225 = (i3 & i224) + (i3 | i224);
                                            int i226 = i225 << 13;
                                            int i227 = (i226 & (~i225)) | ((~i226) & i225);
                                            int i228 = i227 >>> 17;
                                            int i229 = ((~i227) & i228) | ((~i228) & i227);
                                            int i230 = i229 << 5;
                                            int i231 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i232 = (i231 ^ 95) + ((i231 & 95) << 1);
                                            int i233 = i232 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i233;
                                            if (i232 % 2 == 0) {
                                                ((int[]) objArr31[0])[0] = (i229 | i230) & (~(i229 & i230));
                                                i7 = 1;
                                            } else {
                                                int i234 = i229 ^ i230;
                                                i7 = 1;
                                                ((int[]) objArr31[1])[0] = i234;
                                            }
                                            int i235 = (i233 ^ 67) + ((i233 & 67) << i7);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i235 % 128;
                                            if (i235 % 2 != 0) {
                                                int i236 = 75 / 0;
                                            }
                                            return objArr31;
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (Throwable unused) {
                    }
                }
                Object[] objArr32 = {new int[]{i2}, new int[1], new int[]{i2}, null};
                int i237 = ~((~i2) | 428585343);
                int i238 = ((285249834 | i237) * (-374)) + 1576660226 + ((i237 | 143335509) * 374);
                int iTuitionPaymentFragmentbindingInflater4 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                int i239 = -(-(i238 * (-463)));
                int i240 = ~i238;
                int i241 = ~iTuitionPaymentFragmentbindingInflater4;
                int i242 = ~((i240 ^ i241) | (i240 & i241));
                int i243 = ~(~i238);
                int i244 = (i243 & i242) | (i242 ^ i243);
                int i245 = ~i241;
                int i246 = (i239 - (~(((i244 & i245) | (i244 ^ i245)) * 464))) - 1;
                int i247 = (iTuitionPaymentFragmentbindingInflater4 ^ (-1)) | iTuitionPaymentFragmentbindingInflater4;
                int i248 = -(-(((i247 & i240) | (i247 ^ i240)) * (-464)));
                int i249 = -(-((((i246 & i248) + (i248 | i246)) - (~(((~iTuitionPaymentFragmentbindingInflater4) | (~i240)) * 464))) - 1));
                int i250 = (i3 ^ i249) + ((i3 & i249) << 1);
                int i251 = i250 << 13;
                int i252 = (i251 & (~i250)) | ((~i251) & i250);
                int i253 = i252 >>> 17;
                int i254 = ((~i252) & i253) | ((~i253) & i252);
                int i255 = i254 << 5;
                ((int[]) objArr32[1])[0] = ((~i254) & i255) | ((~i255) & i254);
                return objArr32;
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
            private static java.lang.String $$c(byte r7, short r8, int r9) {
                /*
                    int r9 = r9 * 2
                    int r9 = 1 - r9
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    int r8 = r8 * 4
                    int r8 = 107 - r8
                    byte[] r0 = defpackage.TrustedWebActivityDisplayMode.$$a
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r5 = r2
                    r8 = r7
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
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
                    int r7 = -r7
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r5
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.TrustedWebActivityDisplayMode.$$c(byte, short, int):java.lang.String");
            }
        }, 2, null);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return runextracallback;
    }

    static {
        d = 0;
        g();
        INSTANCE = new Companion(null);
        int i = g + 73;
        d = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityListBankBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 2115751138, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 557336701, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).codePointAt(6) - 2025448948, 19795895, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_app).substring(13, 16).length() + 1162717729, -19795894);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_list_bank;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ItemVocationalTrainingRegionBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(ItemVocationalTrainingRegionBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 87865786, -1389082909, ItemVocationalTrainingRegionBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1389082911);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1726446916, -391919329, 1768666740 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_paid_orderid).substring(0, 9).codePointAt(3), 391919329);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    static void g() {
        b = -2963099888811357969L;
    }
}
