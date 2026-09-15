package com.bpjstku.presentation.program.jkp;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJkpMainBinding;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.program.jkp.JkpMainActivity;
import com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity;
import com.bpjstku.presentation.program.jkp.model.JkpMenu;
import com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzhe;
import defpackage.Camera2CapturePipelineTorchTask;
import defpackage.Camera2CapturePipelineTorchTaskExternalSyntheticLambda3;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMaxImages;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00108\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0015\u0010\u0006\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/JkpMainActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkpMainBinding;", "<init>", "()V", "", "b", "asInterface", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/lang/String;", "LCamera2CapturePipelineTorchTaskExternalSyntheticLambda3;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpMainActivity extends BindingBaseActivity<ActivityJkpMainBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f603a;
    private static long d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_jkp_main;
    private static final byte[] $$a = {109, 7, 114, -90, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 54;
    private static int cancel = 1;
    private static int asBinder = 0;
    private static int g = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i5)) | i8 | (~(i3 | i5));
        int i10 = (~(i7 | (~i5))) | i8;
        int i11 = (~(i5 | i6)) | (~((~i3) | i6));
        int i12 = i6 + i3 + i + (929125522 * i2) + (1849324972 * i4);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i6) + 1146290176 + ((-1462591364) * i3) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i) + ((-291241984) * i2) + (1012400128 * i4) + ((-1810169856) * i13);
        int i15 = ((i6 * (-2058557531)) - 518432259) + (i3 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i * (-2058558961)) + (i2 * 548722830) + (i4 * 1549712660) + (i13 * (-2087387136));
        return i14 + ((i15 * i15) * (-343605248)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jkp.JkpMainActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 1
            int r9 = 197 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            int r9 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.JkpMainActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    public JkpMainActivity() {
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getMaxImages.MediaBrowserCompatMediaBrowserImplApi213();
        this.b = LazyKt.lazy(new Camera2CapturePipelineTorchTask(this));
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkp.JkpMainActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/JkpMainActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V", "", "I", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JkpMainActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f603a = 0;
        g();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        int i = cancel + 79;
        f603a = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkpMainBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        g = i2 % 128;
        int i3 = i2 % 2;
        JkpMainActivity$bindingInflater$1 jkpMainActivity$bindingInflater$1 = JkpMainActivity$bindingInflater$1.b;
        int i4 = asBinder + 1;
        g = i4 % 128;
        int i5 = i4 % 2;
        return jkpMainActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JkpMainActivity jkpMainActivity = this;
        Intrinsics.checkNotNullParameter(jkpMainActivity, "");
        jkpMainActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJkpMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJkpMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_lost_job_security));
        RecyclerView recyclerView = ((ActivityJkpMainBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvJkpMenu;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((Camera2CapturePipelineTorchTaskExternalSyntheticLambda3) this.b.getValue());
        int i2 = asBinder + 91;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0126  */
    /* JADX WARN: Code duplicated, block: B:30:0x0127  */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19472), View.MeasureSpec.getSize(0) + 2624, KeyEvent.getDeadChar(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (d ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 39422), ((Process.getThreadPriority(0) + 20) >> 6) + 481, 37 - TextUtils.indexOf("", "", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            int i4 = $11 + 55;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39422), 481 - Color.blue(0), 36 - ExpandableListView.getPackedPositionChild(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 5;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        g = i2 % 128;
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
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = g + 105;
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int mirror = AndroidCharacter.getMirror('0') + 1707;
            int mirror2 = 'G' - AndroidCharacter.getMirror('0');
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 36), (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, mirror, mirror2, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr3 = new Object[1];
                c($$a[5], (byte) ($$b - 2), (short) 156, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, edgeSlop, jumpTapTimeout, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).codePointAt(1) + 85552376;
            int i2 = ~iCodePointAt;
            int i3 = 1738828085 + (((~(118214905 | i2)) | 10497280) * (-1188));
            int i4 = (~(iCodePointAt | (-118214906))) | 10497280;
            int i5 = ~(94387520 | i2);
            int i6 = i3 + ((i4 | i5) * 594) + (((~((-118214906) | i2)) | 34324665 | i5) * 594) + 698082183;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{21626, 11542, 42664, 14404, 45474, 2943, 35867, 1455, 40783, 4257, 59973, 25348, 58551, 32351, 63447, 18804}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 31043, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{21625, 53091, 25179, 34107, 14392, 21258, 63214, 27080, 36064, 10174, 23173, 64901, 4423, 46164, 12086, 16940}, 39702 - ExpandableListView.getPackedPositionChild(0L), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1219551261};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (Process.myTid() >> 22)), ((Process.getThreadPriority(0) + 20) >> 6) + 1726, 29 - View.MeasureSpec.makeMeasureSpec(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 698082183);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                    int mode2 = View.MeasureSpec.getMode(0) + 1755;
                    int iRgb = Color.rgb(0, 0, 0) + 16777239;
                    Object[] objArr8 = new Object[1];
                    c($$a[5], (byte) ($$b - 2), (short) 156, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, mode2, iRgb, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{21617, 39087, 52694, 12817, 26427, 21612, 39058, 52617, 13047, 26426, 21524, 39096, 52645, 13054, 26378, 21578, 39277, 52658, 13006, 26620, 21543, 39262}, View.getDefaultSize(0, 0) + 52433, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{21621, 23273, 18779, 32735, 28215, 7324, 778, 12881, 8413, 55116, 50606, 62467, 64133, 59884, 38995}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 3627, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                        int mode3 = 1755 - View.MeasureSpec.getMode(0);
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b2 = $$a[5];
                        byte b3 = (byte) ($$b - 2);
                        Object[] objArr11 = new Object[1];
                        c(b2, b3, (short) (b3 << 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, mode3, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                        int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                        byte b4 = $$a[5];
                        Object[] objArr12 = new Object[1];
                        c(b4, (byte) (b4 | 36), (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i9, iIndexOf2, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = ~iIdentityHashCode;
            int i14 = i12 + 1001014488 + ((396179070 | i13) * (-757)) + ((~(536690302 | iIdentityHashCode)) * 1514) + (((~(iIdentityHashCode | (-140511233))) | (~(i13 | 183576644)) | 353113658) * 757);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
                byte b5 = $$a[5];
                byte b6 = (byte) ($$b - 2);
                Object[] objArr14 = new Object[1];
                c(b5, b6, b6, objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity, maxKeyCode, packedPositionChild, 1357589585, false, (String) objArr14[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
            Object[] objArr15 = new Object[1];
            e(new char[]{21617, 39087, 52694, 12817, 26427, 21612, 39058, 52617, 13047, 26426, 21524, 39096, 52645, 13054, 26378, 21578, 39277, 52658, 13006, 26620, 21543, 39262}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 52322, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(new char[]{21621, 23273, 18779, 32735, 28215, 7324, 778, 12881, 8413, 55116, 50606, 62467, 64133, 59884, 38995}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 3697, objArr16);
            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cGreen = (char) Color.green(0);
                int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                Object[] objArr17 = new Object[1];
                c($$a[5], (byte) ($$b - 2), (short) 156, objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen, longPressTimeout, iLastIndexOf, 1344079056, false, (String) objArr17[0], null);
            }
            if (j != ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                Object[] objArr18 = new Object[1];
                e(new char[]{21626, 11542, 42664, 14404, 45474, 2943, 35867, 1455, 40783, 4257, 59973, 25348, 58551, 32351, 63447, 18804}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).length() + 31078, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                e(new char[]{21625, 53091, 25179, 34107, 14392, 21258, 63214, 27080, 36064, 10174, 23173, 64901, 4423, 46164, 12086, 16940}, 39703 - KeyEvent.normalizeMetaState(0), objArr19);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr19[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr20 = {-1219551261};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46038), TextUtils.lastIndexOf("", '0', 0) + 1135, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr21 = {Integer.valueOf(iIntValue2), 0, -523753903, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr20), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int jumpTapTimeout2 = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i17 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                    byte b7 = $$a[5];
                    byte b8 = (byte) ($$b - 2);
                    Object[] objArr22 = new Object[1];
                    c(b7, b8, b8, objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, jumpTapTimeout2, i17, 1298546779, false, (String) objArr22[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.lastIndexOf("", '0', 0, 0)), 1116 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.myPid() >> 22) + 17), Boolean.TYPE});
                }
                Object[] objArr23 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int i18 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr24 = new Object[1];
                    c(b9, b10, b10, objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, packedPositionType, i18, 632103528, false, (String) objArr24[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr23);
                try {
                    Object[] objArr25 = new Object[1];
                    e(new char[]{21617, 39087, 52694, 12817, 26427, 21612, 39058, 52617, 13047, 26426, 21524, 39096, 52645, 13054, 26378, 21578, 39277, 52658, 13006, 26620, 21543, 39262}, View.MeasureSpec.getMode(0) + 52433, objArr25);
                    Class<?> cls5 = Class.forName((String) objArr25[0]);
                    Object[] objArr26 = new Object[1];
                    e(new char[]{21621, 23273, 18779, 32735, 28215, 7324, 778, 12881, 8413, 55116, 50606, 62467, 64133, 59884, 38995}, 3733 - (ViewConfiguration.getScrollBarSize() >> 8), objArr26);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr26[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                        Object[] objArr27 = new Object[1];
                        c($$a[5], (byte) ($$b - 2), (short) 156, objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity, minimumFlingVelocity, deadChar, 1344079056, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1031;
                        int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                        byte b11 = $$a[5];
                        byte b12 = (byte) ($$b - 2);
                        Object[] objArr28 = new Object[1];
                        c(b11, b12, b12, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(longPressTimeout2, iIndexOf3, iKeyCodeFromString, 1357589585, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                    objArr = objArr23;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr29 = new Object[1];
                    c(b13, b14, b14, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, threadPriority, tapTimeout, 632103528, false, (String) objArr29[0], null);
                }
                Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
                objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i19 = ((int[]) objArr30[3])[0];
                int i20 = ((int[]) objArr30[1])[0];
                String[] strArr = (String[]) objArr30[0];
                int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
                int i21 = ((((-1050987165) + (((~((~layoutDirection) | (-55437157))) | 188843013) * (-235))) + (((~((-55437157) | layoutDirection)) | 188843013) * (-470))) + (((~(layoutDirection | (-811873))) | 134217729) * 235)) - 523753903;
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr[2])[0] = i23 ^ (i23 << 5);
            }
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[3])[0];
            if (i25 != i24) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[0];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i25 / (((i25 - 1) * i25) % 2), 0).show();
                Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i26 = ((int[]) objArr[2])[0];
                int i27 = ((int[]) objArr[3])[0];
                int i28 = ((int[]) objArr[1])[0];
                String[] strArr3 = (String[]) objArr[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i29 = i26 + ((((~((-823852009) | iIdentityHashCode2)) | 537563240) * (-566)) - 437604007) + ((~(iIdentityHashCode2 | (-286288769))) * 566);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr31[2])[0] = i31 ^ (i31 << 5);
                return;
            }
            int i32 = asBinder + 11;
            g = i32 % 128;
            int i33 = i32 % 2;
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[3])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i38 = ~i37;
            int i39 = i34 + (-951222229) + (((~(465572434 | i38)) | (-1003454463)) * 98) + (((~(i38 | (-709852605))) | 465572434 | (~(709852604 | i37))) * (-49)) + (((~(i37 | 465572434)) | 293601858) * 49);
            int i40 = i39 ^ (i39 << 13);
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr32[2])[0] = i41 ^ (i41 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr5 != null) {
            int i42 = asBinder + 9;
            g = i42 % 128;
            int i43 = i42 % 2;
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i11));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-2110008878) + (((~((~iIdentityHashCode) | (-831069907))) | (-1661057450)) * (-235)) + (((~((-831069907) | iIdentityHashCode)) | (-1661057450)) * (-470)) + (((~(iIdentityHashCode | (-553719937))) | (-1938407420)) * 235)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i7 = (-1544515348) + (((~((-720017331) | i6)) | 2101776 | (~(1859038634 | i6))) * (-754));
        int i8 = ~((-2101777) | i6);
        int i9 = ~i6;
        if (i5 != i7 + ((i8 | (~(1861140410 | i9))) * (-754)) + ((i9 | (-720017331)) * 754)) {
            throw new RuntimeException("-725077486");
        }
        super.onResume();
        int i10 = asBinder + 5;
        g = i10 % 128;
        int i11 = i10 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1848463464
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
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.JkpMainActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        if (i2 != (-583817194) + (((~(1839157912 | layoutDirection)) | 1009170369) * (-366)) + (((~(layoutDirection | 2109732825)) | 738595456) * 366)) {
            int i3 = g + 101;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int[] iArr = new int[2118033950];
            iArr[2118033949] = 1;
            int i5 = (-151824026) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i6 != 640926898 + (((-294650883) | iUptimeMillis) * (-381)) + (((~((~iUptimeMillis) | (-2077970187))) | 1850727277) * 381) + 592836346) {
            throw new RuntimeException("16043872");
        }
        super.onCreate(bundle);
        int i7 = asBinder + 11;
        g = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 b(final JkpMainActivity jkpMainActivity) {
        int i = 2 % 2;
        JkpMenu jkpMenu = new JkpMenu(1, "Klaim Manfaat JKP", "Kemudahan dalam Klaim Manfaat Jaminan Kehilangan Pekerjaan", R.drawable.ic_eclaim);
        String string = jkpMainActivity.getString(R.string.label_check_tracking_eclaim);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 camera2CapturePipelineTorchTaskExternalSyntheticLambda3 = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda3(jkpMainActivity, CollectionsKt.mutableListOf(jkpMenu, new JkpMenu(2, "Lacak Klaim JKP", string, R.drawable.ic_tracking_claim)), new Function1() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkpMainActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (JkpMenu) obj);
            }
        });
        int i2 = g + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return camera2CapturePipelineTorchTaskExternalSyntheticLambda3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r6
  0x002f: PHI (r6v10 int) = (r6v1 int), (r6v20 int) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(JkpMainActivity jkpMainActivity, JkpMenu jkpMenu) {
        int i;
        String str;
        int i2;
        int i3 = 2 % 2;
        int i4 = g + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(jkpMenu, "");
        if (i5 != 0) {
            i = jkpMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i6 = 94 / 0;
            if (i == TuitionPaymentFragmentbindingInflater1) {
                JkpEligibilityActivity.Companion tuitionPaymentFragmentbindingInflater1 = JkpEligibilityActivity.INSTANCE;
                JkpEligibilityActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkpMainActivity);
                str = "claim_jkp";
            } else if (i == TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                JkpClaimTrackingActivity.Companion tuitionPaymentFragmentbindingInflater2 = JkpClaimTrackingActivity.INSTANCE;
                JkpClaimTrackingActivity.Companion.TuitionPaymentFragmentbindingInflater1(jkpMainActivity);
                i2 = g + 119;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    int i7 = 2 / 2;
                }
                str = "tracking_claim_jkp";
            } else {
                str = "";
            }
        } else {
            i = jkpMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i == TuitionPaymentFragmentbindingInflater1) {
                JkpEligibilityActivity.Companion tuitionPaymentFragmentbindingInflater3 = JkpEligibilityActivity.INSTANCE;
                JkpEligibilityActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkpMainActivity);
                str = "claim_jkp";
            } else if (i == TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                JkpClaimTrackingActivity.Companion tuitionPaymentFragmentbindingInflater4 = JkpClaimTrackingActivity.INSTANCE;
                JkpClaimTrackingActivity.Companion.TuitionPaymentFragmentbindingInflater1(jkpMainActivity);
                i2 = g + 119;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    int i8 = 2 / 2;
                }
                str = "tracking_claim_jkp";
            } else {
                str = "";
            }
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_jht_program", str));
        Intrinsics.checkNotNullParameter(jkpMainActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        Unit unit = Unit.INSTANCE;
        int i9 = g + 37;
        asBinder = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this}, -1744695716, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, 1744695717);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_internet).substring(0, 16).codePointAt(1) + 2051885591, ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this}, 1439085618, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, -1439085618);
    }

    static void g() {
        d = -7445215154974753525L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        JkpMainActivity jkpMainActivity = (JkpMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = g + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
