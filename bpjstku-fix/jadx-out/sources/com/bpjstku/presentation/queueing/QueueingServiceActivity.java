package com.bpjstku.presentation.queueing;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.databinding.ActivityQueueingServiceBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityMenu;
import com.bpjstku.presentation.queueing.QueueingServiceActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.gson.Gson;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getMaxImages;
import defpackage.getSessionStateCallback;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00118\u0015X\u0095D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/bpjstku/presentation/queueing/QueueingServiceActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityQueueingServiceBinding;", "<init>", "()V", "", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "a", "Lcom/bpjstku/data/config/model/AntreanMenuConfig;", "Lcom/bpjstku/data/config/model/AntreanMenuConfig;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueueingServiceActivity extends BindingBaseActivity<ActivityQueueingServiceBinding> {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f626a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_queueing_service;
    private AntreanMenuConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 57, 101, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 161;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i3 | i2)) | i;
        int i8 = (~((~i2) | i3)) | i;
        int i9 = (~i) | i3;
        int i10 = i + i3 + i6 + (440753341 * i5) + ((-634449194) * i4);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i) + 1075183616 + ((-1421434046) * i3) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i6) + (780402688 * i5) + ((-180879360) * i4) + (353763328 * i11);
        int i13 = (i * 892202253) + 1676176333 + (i3 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i6 * 892200819) + (i5 * (-770690073)) + (i4 * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        if (i14 != 1) {
            return i14 != 2 ? b(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.presentation.queueing.QueueingServiceActivity.$$a
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.QueueingServiceActivity.c(int, int, int, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityQueueingServiceBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        QueueingServiceActivity$bindingInflater$1 queueingServiceActivity$bindingInflater$1 = QueueingServiceActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 85;
        d = i4 % 128;
        int i5 = i4 % 2;
        return queueingServiceActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 9;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6 = i3 + 15;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ActivityQueueingServiceBinding activityQueueingServiceBinding = (ActivityQueueingServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityQueueingServiceBinding.layoutToolbar.tvToolbarTitle.setText(getString(R.string.action_queueing));
        activityQueueingServiceBinding.layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: getLegacySupportedCombinationList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                QueueingServiceActivity.TuitionPaymentFragmentbindingInflater1(927897055, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr, -927897053, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        try {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            String strB = getMaxImages.b();
            if (strB.length() > 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
                d = i2 % 128;
                int i3 = i2 % 2;
            }
        } catch (Exception unused) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AntreanMenuConfig(false, null, null, null, false, 31, null);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityQueueingServiceBinding activityQueueingServiceBinding = (ActivityQueueingServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        CardView cardView = activityQueueingServiceBinding.cardClaimService;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getLimitedSupportedCombinationList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        CardView cardView2 = activityQueueingServiceBinding.cardInfoComplaintService;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getConcurrentSupportedCombinationList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1((View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 95;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 64839), 1356 - KeyEvent.keyCodeFromString(""), 37 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 47773), 468 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 33;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr2;
        int i = 0;
        QueueingServiceActivity queueingServiceActivity = (QueueingServiceActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (Color.green(0) + 29944);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte[] bArr = $$a;
            byte b = bArr[28];
            short s = bArr[5];
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) (s & 37), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, packedPositionGroup, i3, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAlpha = (char) (29944 - Color.alpha(0));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
                int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[28];
                short s2 = (short) (bArr2[12] + 1);
                Object[] objArr4 = new Object[1];
                c(b2, s2, (byte) (s2 | 16), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, capsMode, packedPositionType, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr5[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i5 = ~startElapsedRealtime;
            int i6 = (((((~(269362517 | i5)) | (~(startElapsedRealtime | 481964943))) * 959) - 818867245) + (((~(startElapsedRealtime | 269362517)) | (~(i5 | 481964943))) * 959)) - 1127664104;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{25826, 25736, 14853, 43804, 1622, 54030, 31850, 51357, 37892, 5779, 49745, 55642, 34069, 10217, 62139, 59957, 46793, 13563, 57797, 64233}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1064).substring(0, 61).length() - 61, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{14976, 15081, 59942, 8368, 54896, 22705, 50441, 29169, 51772, 50869, 18920, 24622, 56152, 63365, 31031, 21319, 59547, 58563, 27240, 17282}, View.getDefaultSize(0, 0), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, queueingServiceActivity)).intValue();
            try {
                Object[] objArr8 = {745159994};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - View.getDefaultSize(0, 0)), 1726 - View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetAfter("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), -1127664104, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int defaultSize = View.getDefaultSize(0, 0) + 1755;
                    int iAxisFromString = 22 - MotionEvent.axisFromString("");
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[28];
                    short s3 = (short) (bArr3[12] + 1);
                    Object[] objArr9 = new Object[1];
                    c(b3, s3, (byte) (s3 | 16), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, defaultSize, iAxisFromString, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{5183, 5214, 29990, 36403, 18810, 63027, 13337, 33021, 58520, 22965, 59259, 37225, 62912, 26775, 55273, 41580, 50718, 31711, 50427, 45714, 55154, 35383, 46555, 17344, 42932, 34135}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{32482, 32391, 57205, 64499, 58155, 33782, 47084, 778, 36441, 62442, 37563, 4832, 40727, 49878, 41579, 8638, 44243, 53650, 45354}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_get_bank_point).substring(1, 2).length() - 1, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int iMyPid = 23 - (Process.myPid() >> 22);
                        Object[] objArr12 = new Object[1];
                        c($$a[28], (short) 88, (byte) 52, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType2, iResolveSizeAndState, iMyPid, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                        int i9 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int defaultSize2 = View.getDefaultSize(0, 0) + 23;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[28];
                        short s4 = bArr4[5];
                        Object[] objArr13 = new Object[1];
                        c(b4, s4, (byte) (s4 & 37), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, i9, defaultSize2, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrB$7879113[1])[0];
        int i11 = ((int[]) objArrB$7879113[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                while (i < strArr.length) {
                    arrayList.add(strArr[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i12 = ((int[]) objArrB$7879113[3])[0];
        int i13 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr14 = {new int[]{i13}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i14 = i12 + ((((-118798613) + (((~((~elapsedCpuTime) | 420456019)) | 615518348) * 446)) + (((~(elapsedCpuTime | 1035974367)) | 17540097) * 446)) - 356723736);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr14[3])[0] = i16 ^ (i16 << 5);
        int i17 = d + 121;
        TuitionPaymentFragmentbindingInflater1 = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 1031;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
            Object[] objArr15 = new Object[1];
            c($$a[28], (short) 140, (byte) 52, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, iIndexOf, bitsPerPixel, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{5183, 5214, 29990, 36403, 18810, 63027, 13337, 33021, 58520, 22965, 59259, 37225, 62912, 26775, 55273, 41580, 50718, 31711, 50427, 45714, 55154, 35383, 46555, 17344, 42932, 34135}, TextUtils.lastIndexOf("", '0', 0) + 1, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{32482, 32391, 57205, 64499, 58155, 33782, 47084, 778, 36441, 62442, 37563, 4832, 40727, 49878, 41579, 8638, 44243, 53650, 45354}, KeyEvent.normalizeMetaState(0), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int i19 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i20 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
            byte[] bArr5 = $$a;
            byte b5 = bArr5[28];
            short s5 = (short) (bArr5[12] + 1);
            Object[] objArr18 = new Object[1];
            c(b5, s5, (byte) (s5 | 16), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, i19, i20, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr19 = new Object[1];
                c(b7, (short) (b7 | 192), b6, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, keyRepeatTimeout, iLastIndexOf, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr20[3])[0];
            int i22 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i23 = (int) Runtime.getRuntime().totalMemory();
            int i24 = (((((~((-582583927) | i23)) | 2621956) * (-283)) + 986293717) + ((~(i23 | (-579961971))) * 283)) - 740251673;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[2])[0] = i26 ^ (i26 << 5);
            int i27 = TuitionPaymentFragmentbindingInflater1 + 119;
            d = i27 % 128;
            int i28 = i27 % 2;
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{25826, 25736, 14853, 43804, 1622, 54030, 31850, 51357, 37892, 5779, 49745, 55642, 34069, 10217, 62139, 59957, 46793, 13563, 57797, 64233}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{14976, 15081, 59942, 8368, 54896, 22705, 50441, 29169, 51772, 50869, 18920, 24622, 56152, 63365, 31031, 21319, 59547, 58563, 27240, 17282}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_hat_text).substring(0, 4).codePointAt(2) - 112, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, queueingServiceActivity)).intValue();
            Object[] objArr23 = {745159994};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46039), TextUtils.indexOf((CharSequence) "", '0', 0) + 1135, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -740251673, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i29 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr25 = new Object[1];
                c($$a[28], (short) 140, (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(pressedStateDuration, edgeSlop, i29, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getMode(0) + 45993), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1117, 17 - View.MeasureSpec.getMode(0)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                int iRed = Color.red(0) + 1031;
                int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte b8 = $$a[7];
                byte b9 = b8;
                Object[] objArr26 = new Object[1];
                c(b9, (short) (b9 | 192), b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode2, iRed, iIndexOf2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{5183, 5214, 29990, 36403, 18810, 63027, 13337, 33021, 58520, 22965, 59259, 37225, 62912, 26775, 55273, 41580, 50718, 31711, 50427, 45714, 55154, 35383, 46555, 17344, 42932, 34135}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{32482, 32391, 57205, 64499, 58155, 33782, 47084, 778, 36441, 62442, 37563, 4832, 40727, 49878, 41579, 8638, 44243, 53650, 45354}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int i30 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int i31 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr6 = $$a;
                    byte b10 = bArr6[28];
                    short s6 = (short) (bArr6[12] + 1);
                    Object[] objArr29 = new Object[1];
                    c(b10, s6, (byte) (s6 | 16), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, i30, i31, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int mirror = AndroidCharacter.getMirror('0') + 983;
                    int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                    Object[] objArr30 = new Object[1];
                    c($$a[28], (short) 140, (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMakeMeasureSpec, mirror, deadChar, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
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
        int i32 = ((int[]) objArr2[2])[0];
        int i33 = ((int[]) objArr2[3])[0];
        int i34 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int iMyTid = Process.myTid();
        int i35 = ~iMyTid;
        int i36 = i32 + (-534334963) + (((~(380756008 | i35)) | (-938601403)) * 98) + (((~(i35 | (-625036179))) | 380756008 | (~(625036178 | iMyTid))) * (-49)) + (((~(iMyTid | 380756008)) | 313565224) * 49);
        int i37 = (i36 << 13) ^ i36;
        int i38 = i37 ^ (i37 >>> 17);
        ((int[]) objArr31[2])[0] = i38 ^ (i38 << 5);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f0, code lost:
    
        if (r1 == ((r6 + (((~(99878601 | r4)) | (-1845413870)) * (-1976))) + ((((~(r2 | 1815789932)) | 70254664) | (~((-1815789933) | r4))) * 988))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f2, code lost:
    
        r1 = new int[194370551];
        r1[194370550(0xb95dbf6, float:5.772367E-32)] = 1;
        r2 = (-118444966) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
        r1 = com.bpjstku.presentation.queueing.QueueingServiceActivity.d + 71;
        com.bpjstku.presentation.queueing.QueueingServiceActivity.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0114, code lost:
    
        super.onResume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0117, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x011f, code lost:
    
        throw new java.lang.RuntimeException("-611452858");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
    
        if (r1 == ((((-1481589384) + ((73405456 | r8) * (-476))) + (r8 * 952)) + ((~((~r6) | 1459142523)) * 476))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a0, code lost:
    
        if (r1 == (((-258150223) + ((r7 | (~(r8 | 1940356095))) * 497)) + (((~(r6 | 1940356095)) | ((~((-833057000) | r8)) | 555745446)) * 497))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a2, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        r6 = (-211655368) + ((r2 | 70254664) * 988);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.QueueingServiceActivity.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00bd  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step5).substring(3, 4).length() + 269249467;
            int i4 = ~length;
            if (i3 != 1465569320 + (((~(i4 | 415927244)) | (~(1245914787 | i4)) | (-1523298288)) * 464) + (((-277383501) | length) * (-464)) + (((~(length | 415927244)) | (-1523298288)) * 464)) {
                int[] iArr = new int[1566217663];
                iArr[1566217662] = 1;
                int i5 = 176770754 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i6 = d + 7;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            int i8 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 927334831;
            if (i8 != (((-875673784) + (((-201326593) | length2) * (-381))) + (((~((~length2) | (-1570523932))) | 1908407135) * 381)) - 603979776) {
                int[] iArr2 = new int[1566217663];
                iArr2[1566217662] = 1;
                int i9 = 176770754 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i10 = d + 7;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i13 = (int) Runtime.getRuntime().totalMemory();
        if (i12 != 362202909 + (((~(i13 | (-2010582675))) | 294671343) * 191) + (((~((~i13) | (-2010582675))) | 294650498) * 191)) {
            int i14 = 986638448 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d3, code lost:
    
        if (r1 != (((((~((-1908458204) | r4)) | (~(r2 | 670597761))) * 959) + 881866741) + (((~(r2 | (-1908458204))) | (~(r4 | 670597761))) * 959))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.queueing.QueueingServiceActivity.TuitionPaymentFragmentbindingInflater1 + 35;
        com.bpjstku.presentation.queueing.QueueingServiceActivity.d = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e1, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f0, code lost:
    
        throw new java.lang.RuntimeException("-938874599");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0077, code lost:
    
        if (r1 == ((r7 + (((~(r4 | (-1127755344))) | (~((-297767801) | r5))) * (-672))) + (((~(1127755343 | r5)) | (-1405075328)) * 672))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        if (r1 == ((((-410628888) + (((~(889247957 | r4)) | 42476842) * 104)) + ((~((~r4) | (-872464386))) * (-104))) + ((r4 | 59260414) * 104))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a9, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.QueueingServiceActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        QueueingServiceActivity queueingServiceActivity = (QueueingServiceActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            queueingServiceActivity.getOnBackPressedDispatcher().onBackPressed();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
            d = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(QueueingServiceActivity queueingServiceActivity, View view) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        AntreanMenuConfig antreanMenuConfig = queueingServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String linkAntreanKlaim = null;
        if (antreanMenuConfig != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                antreanMenuConfig.getLinkAntreanKlaim();
                linkAntreanKlaim.hashCode();
                throw null;
            }
            linkAntreanKlaim = antreanMenuConfig.getLinkAntreanKlaim();
        }
        if (linkAntreanKlaim == null) {
            int i3 = d;
            int i4 = i3 + 71;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 99;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            str = "";
        } else {
            str = linkAntreanKlaim;
        }
        if (str.length() > 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            String string = queueingServiceActivity.getString(R.string.label_claim_jht_instruction);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(queueingServiceActivity, str, string, 0, null, false, 56);
        } else {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Link antrean belum tersedia", 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Layanan Informasi dan Pengaduan - Coming Soon", 0).show();
        Unit unit = Unit.INSTANCE;
        int i4 = d + 97;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(QueueingServiceActivity queueingServiceActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(927897055, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{queueingServiceActivity, view}, -927897053, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        f626a = 0;
        g();
        INSTANCE = new Companion(null);
        int i = g + 63;
        f626a = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-373926997, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 373926997, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(1644769481, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this, context}, -1644769480, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1998278296129317292L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.queueing.QueueingServiceActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 107
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.QueueingServiceActivity.$$i(short, int, byte):java.lang.String");
    }
}
