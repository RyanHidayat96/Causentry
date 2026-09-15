package com.bpjstku.presentation.scholarship.confirm;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
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
import com.bpjstku.databinding.ActivityScholarHistoryBinding;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.cloudmessaging.zzu;
import defpackage.CaptureSession1;
import defpackage.ViewPortBuilder;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.refreshPreviewSize;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/scholarship/confirm/ScholarHistoryActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityScholarHistoryBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "LrefreshPreviewSize;", "LrefreshPreviewSize;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarHistoryActivity extends BindingBaseActivity<ActivityScholarHistoryBinding> {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static char b;
    private static char d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private refreshPreviewSize TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {41, 2, 45, -60, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 230;
    private static int g = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f629a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i5);
        int i10 = (~i5) | (~((~i3) | i4));
        int i11 = (~(i5 | i3)) | (~(i7 | i5)) | (~i8);
        int i12 = i4 + i3 + i + ((-953487067) * i6) + ((-1992133889) * i2);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i4) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i6) + (1961361408 * i2) + (907935744 * i13);
        int i15 = ((i4 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i6 * 2077717299) + (i2 * 1957688713) + (i13 * 166854656);
        if (i14 + (i15 * i15 * (-213778432)) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        int i16 = 2 % 2;
        int i17 = asBinder + 59;
        g = i17 % 128;
        int i18 = i17 % 2;
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
    private static void c(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 197 - r5
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r6 = r6 + r4
            int r5 = r5 + 1
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/scholarship/confirm/ScholarHistoryActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lcom/bpjstku/domain/scholarship/model/ScholarBenefit;", "p1", "", "b", "(Landroid/content/Context;Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, List<ScholarBenefit> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ScholarHistoryActivity.class, new Pair[]{TuplesKt.to("scholar_data_list", p1.toArray(new ScholarBenefit[0]))});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        ScholarHistoryActivity$bindingInflater$1 scholarHistoryActivity$bindingInflater$1 = ScholarHistoryActivity$bindingInflater$1.b;
        if (i3 == 0) {
            return scholarHistoryActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        List list;
        int i = 2 % 2;
        ScholarHistoryActivity scholarHistoryActivity = this;
        Intrinsics.checkNotNullParameter(scholarHistoryActivity, "");
        scholarHistoryActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityScholarHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityScholarHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText("Riwayat Konfirmasi");
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("scholar_data_list");
        refreshPreviewSize refreshpreviewsize = null;
        if (parcelableArrayExtra != null) {
            int i2 = asBinder + 107;
            g = i2 % 128;
            int i3 = i2 % 2;
            list = ArraysKt.toList(parcelableArrayExtra);
            int i4 = g + 91;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            list = null;
        }
        Intrinsics.checkNotNull(list, "");
        ScholarHistoryActivity scholarHistoryActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new refreshPreviewSize(scholarHistoryActivity2);
        RecyclerView recyclerView = ((ActivityScholarHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).recyclerHistory;
        recyclerView.setLayoutManager(new LinearLayoutManager(scholarHistoryActivity2));
        refreshPreviewSize refreshpreviewsize2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (refreshpreviewsize2 == null) {
            int i6 = g + 69;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                refreshpreviewsize.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            refreshpreviewsize2 = null;
        }
        recyclerView.setAdapter(refreshpreviewsize2);
        refreshPreviewSize refreshpreviewsize3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (refreshpreviewsize3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            refreshpreviewsize = refreshpreviewsize3;
        }
        refreshpreviewsize.submitList(list);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        g = i2 % 128;
        try {
            if (i2 % 2 != 0) {
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
                int i3 = asBinder + 81;
                g = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = asBinder + 71;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 97;
        asBinder = i2 % 128;
        Object obj = null;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                byte b2 = $$a[7];
                Object[] objArr2 = new Object[1];
                c((short) 193, b2, (byte) (b2 | 15), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, packedPositionGroup, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
            int iAlpha = 23 - Color.alpha(0);
            byte b3 = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 193, b3, (byte) (b3 | 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, jumpTapTimeout, iAlpha, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                int iAlpha2 = 23 - Color.alpha(0);
                byte b4 = $$a[7];
                Object[] objArr4 = new Object[1];
                c((short) 156, b4, b4, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, offsetAfter, iAlpha2, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr5[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = 286837571 + (((~((~iIdentityHashCode) | (-546021765))) | (~((-23332865) | iIdentityHashCode))) * (-302)) + ((~((-546021765) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-569354629))) | (-805289919)) * 302) + 1656875204;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{44303, 27588, 58588, 62938, 51796, 41790, 22608, 48680, 18381, 57031, 33959, 22757, 62037, 41099, 36613, 11784, 64233, 62648}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).codePointAt(1) - 105, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{38985, 53070, 49826, 62535, 5613, 40487, 14201, 38247, 27283, 34080, 7554, 43558, 36346, 2962, 19292, 5277, 57795, 49323}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {845335654};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42049), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1725, 29 - Color.red(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 1656875204);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int iRgb = Color.rgb(0, 0, 0) + 16778971;
                    int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b5 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c((short) 156, b5, b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iRgb, keyRepeatTimeout, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{17445, 41428, 42563, 39599, 11923, 49733, 28492, 34934, 21566, 14629, 2389, 59024, 9950, 65397, 65214, 15603, 8423, 53689, 20934, 28659, 53718, 33630, 24361, 56565}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{43089, 43071, 10529, 60716, 63177, 59021, 7700, 14399, 65121, 49744, 21641, 1200, 56418, 31781, 43543, 9571, 10872, 25829}, 14 - MotionEvent.axisFromString(""), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                        int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iBlue = 23 - Color.blue(0);
                        byte b6 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((short) 104, b6, b6, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, doubleTapTimeout, iBlue, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                        int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                        int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b7 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        c((short) 193, b7, (byte) (b7 | 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop2, i8, longPressTimeout, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    int i11 = asBinder + 11;
                    g = i11 % 128;
                    int i12 = i11 % 2;
                    arrayList.add(strArr[i3]);
                    i3++;
                    int i13 = asBinder + 47;
                    g = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i15 = asBinder + 25;
        g = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        int i18 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        Object[] objArr14 = {new int[]{i18}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i19 = i17 + (-388699869) + (((~((-32978757) | startUptimeMillis)) | (-200800246)) * (-502)) + ((~((~startUptimeMillis) | (-21176577))) * (-502)) + (((~(startUptimeMillis | (-179623670))) | (-32978757)) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr14[3])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int i22 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
            int i23 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte b8 = $$a[7];
            Object[] objArr15 = new Object[1];
            c((short) 52, b8, b8, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, i22, i23, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{17445, 41428, 42563, 39599, 11923, 49733, 28492, 34934, 21566, 14629, 2389, 59024, 9950, 65397, 65214, 15603, 8423, 53689, 20934, 28659, 53718, 33630, 24361, 56565}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{43089, 43071, 10529, 60716, 63177, 59021, 7700, 14399, 65121, 49744, 21641, 1200, 56418, 31781, 43543, 9571, 10872, 25829}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step4).substring(39, 42).codePointAt(0) - 82, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iBlue2 = Color.blue(0) + 1031;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
            byte b9 = $$a[7];
            Object[] objArr18 = new Object[1];
            c((short) 156, b9, b9, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, iBlue2, iResolveSizeAndState, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i24 = asBinder + 29;
            g = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr = $$a;
                Object[] objArr19 = new Object[1];
                c(bArr[7], bArr[28], (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, fadingEdgeLength, iIndexOf, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr20[3])[0];
            int i27 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i29 = ~(998239483 | i28);
            int i30 = (-1404038699) + ((135200769 | i29) * (-476)) + (i29 * 952) + ((~((~i28) | 998239483)) * 476) + 511481248;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{44303, 27588, 58588, 62938, 51796, 41790, 22608, 48680, 18381, 57031, 33959, 22757, 62037, 41099, 36613, 11784, 64233, 62648}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{38985, 53070, 49826, 62535, 5613, 40487, 14201, 38247, 27283, 34080, 7554, 43558, 36346, 2962, 19292, 5277, 57795, 49323}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_card_register_success).substring(11, 12).length() + 15, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {845335654};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getCapsMode("", 0, 0) + 1134, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 511481248, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                int i33 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b10 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 52, b10, b10, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid, minimumFlingVelocity, i33, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1116, 17 - (KeyEvent.getMaxKeyCode() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1031;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                byte[] bArr2 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr2[7], bArr2[28], (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration2, iIndexOf2, tapTimeout, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{17445, 41428, 42563, 39599, 11923, 49733, 28492, 34934, 21566, 14629, 2389, 59024, 9950, 65397, 65214, 15603, 8423, 53689, 20934, 28659, 53718, 33630, 24361, 56565}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{43089, 43071, 10529, 60716, 63177, 59021, 7700, 14399, 65121, 49744, 21641, 1200, 56418, 31781, 43543, 9571, 10872, 25829}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iGreen = 1031 - Color.green(0);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                    byte b11 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 156, b11, b11, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(size, iGreen, scrollDefaultDelay, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iAlpha3 = Color.alpha(0) + 1031;
                    int gidForName2 = Process.getGidForName("") + 16;
                    byte b12 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((short) 52, b12, b12, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionType, iAlpha3, gidForName2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr[1])[0];
        int i35 = ((int[]) objArr[3])[0];
        if (i35 != i34) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i36 = asBinder + 97;
                g = i36 % 128;
                int i37 = 2;
                int i38 = i36 % 2;
                while (i3 < strArr3.length) {
                    int i39 = g + 63;
                    asBinder = i39 % 128;
                    int i40 = i39 % i37;
                    arrayList2.add(strArr3[i3]);
                    i3++;
                    i37 = 2;
                }
            }
            throw new RuntimeException(String.valueOf(i35));
        }
        int i41 = asBinder + 123;
        g = i41 % 128;
        int i42 = i41 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i46 = ~iIdentityHashCode2;
        int i47 = (~((-1010422453) | i46)) | 269586612;
        int i48 = ~(iIdentityHashCode2 | (-25306443));
        int i49 = i43 + (-1862194079) + ((i47 | i48) * (-502)) + ((i48 | (~(i46 | (-740835841)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i50 = i49 ^ (i49 << 13);
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[2])[0] = i51 ^ (i51 << 5);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 41;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (47772 - TextUtils.lastIndexOf("", '0', i5, i5));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 468;
                        int capsMode = 13 - TextUtils.getCapsMode("", i5, i5);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, tapTimeout, capsMode, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 467, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2323 - TextUtils.getOffsetAfter("", 0), 44 - View.combineMeasuredStates(0, 0), -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
    
        if (r1 != ((r6 + ((r4 | (~(r5 | 2008499130))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(r2 | 2008499130)) | (~((-1412432385) | r5))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b2, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.asBinder + 81;
        com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00be, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        r1 = (-151659658) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ce, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cf, code lost:
    
        r1 = (-321217270) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        if (r1 == ((((-1464942048) + (((~((~r4) | (-537204997))) | (~((-1142472922) | r4))) * (-302))) + ((~((-537204997) | r4)) * (-604))) + (((~(r4 | (-1679677918))) | (-1992163296)) * 302))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (r1 == (((1744528840 + (((~((~r4) | (-7471233))) | (~((-1115761412) | r4))) * (-302))) + ((~((-7471233) | r4)) * (-604))) + (((~(r4 | (-1123232644))) | (-1409006512)) * 302))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r6 = (-375625940) + (((~((-596066747) | r2)) | (-1982989219)) * (-318));
        r4 = ~((-1982989219) | r2);
        r5 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i4 = ~((-343013263) | i3);
        int i5 = 958584472 + ((73437700 | i4) * (-280)) + ((i4 | (~(1173000805 | i3))) * 140);
        int i6 = ~((-269575563) | i3);
        int i7 = ~i3;
        if (i2 != i5 + (((~(i7 | 1442576367)) | i6 | (~((-73437701) | i7))) * 140)) {
            int[] iArr = new int[1518576448];
            iArr[1518576447] = 1;
            int i8 = 555150528 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i9 = g + 117;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 114409381;
        int i13 = ~i12;
        int i14 = ~(492194401 | i13);
        if (i11 != (-184258132) + ((1612755098 | i14) * (-712)) + (((~(i12 | 2104949499)) | (~(i13 | (-1612755099)))) * (-712)) + (((-2086861564) | i14) * 712)) {
            throw null;
        }
        super.onStart();
        int i15 = g + 93;
        asBinder = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi | 899371684);
        if (i4 != (((-1384693728) | i5) * (-658)) + 436352872 + ((i5 | (-2006712320)) * 658)) {
            int i6 = 10930388 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i7 != (((-53010984) + (((-20480281) | startElapsedRealtime) * (-381))) + (((~((~startElapsedRealtime) | 1849717828)) | (-1161340253)) * 381)) - 786947912) {
            throw null;
        }
        super.onCreate(bundle);
        int i8 = g + 33;
        asBinder = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        asInterface = 0;
        g();
        INSTANCE = new Companion(null);
        int i = f629a + 87;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityScholarHistoryBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1815922315, 1815922315, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 105;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return R.layout.activity_scholar_history;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step1).substring(25, 35).length() + 746178876;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -386110517, 386110518, length, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = g + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 46586;
        b = (char) 5992;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 216;
        d = (char) 17405;
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
    private static java.lang.String $$i(int r7, short r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 108
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.$$c
            int r9 = r9 * 2
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarHistoryActivity.$$i(int, short, int):java.lang.String");
    }
}
