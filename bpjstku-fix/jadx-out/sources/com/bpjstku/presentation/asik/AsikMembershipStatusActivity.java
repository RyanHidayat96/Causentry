package com.bpjstku.presentation.asik;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAsikMembershipStatusBinding;
import com.bpjstku.presentation.asik.AsikMembershipStatusActivity;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.asik.resign.AsikResignProgramActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ContextUtil;
import defpackage.ContextUtilApi34Impl;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.ViewPortBuilder;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.cropJpegByteArray;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00158\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/asik/AsikMembershipStatusActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikMembershipStatusBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikMembershipStatusActivity extends BindingBaseActivity<ActivityAsikMembershipStatusBinding> {
    private static char[] TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.activity_asik_membership_status;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {48, -110, 22, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 187;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i5));
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i | i2));
        int i12 = i8 | i;
        int i13 = (~(i5 | i)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i + i2 + i3 + ((-1468046718) * i4) + (327422179 * i6);
        int i16 = i15 * i15;
        int i17 = (677926197 * i) + 1810235392 + (1154460365 * i2) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i3) + (1933049856 * i4) + (743702528 * i6) + (286654464 * i16);
        int i18 = (i * (-645773371)) + 280972133 + (i2 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i3 * (-645772719)) + (i4 * 1523302178) + (i6 * 1475409363) + (i16 * (-1007288320));
        return i17 + ((i18 * i18) * (-492175360)) != 1 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
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
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.presentation.asik.AsikMembershipStatusActivity.$$a
            int r5 = 197 - r5
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.AsikMembershipStatusActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.AsikMembershipStatusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/bpjstku/presentation/asik/AsikMembershipStatusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            ContextUtilApi34Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = ContextUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikMembershipStatusBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        AsikMembershipStatusActivity$bindingInflater$1 asikMembershipStatusActivity$bindingInflater$1 = AsikMembershipStatusActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return asikMembershipStatusActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        AsikMembershipStatusActivity asikMembershipStatusActivity = this;
        Intrinsics.checkNotNullParameter(asikMembershipStatusActivity, "");
        asikMembershipStatusActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityAsikMembershipStatusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAsikMembershipStatusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_active_participant_verification));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        CardView cardView = ((ActivityAsikMembershipStatusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvLapakAsikNonActiveParticipant;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        CardView cardView2 = cardView;
        Function1 function1 = new Function1() { // from class: setTag
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikMembershipStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(cardView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        cardView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(i3, i3, i3), (Process.myTid() >> 22) + 1270, 18 - Color.alpha(i3), 407021364, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 97;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i11 = $11 + 19;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.argb(0, 0, 0, 0) + 3225, 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2133916302, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 1755;
                        int defaultSize = 23 - View.getDefaultSize(0, 0);
                        byte b5 = (byte) ($$f & 15);
                        byte b6 = (byte) (b5 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, deadChar, defaultSize, 387247676, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41240), (Process.myPid() >> 22) + 1705, 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1434471773, false, $$i((byte) ($$c[0] + 1), b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i16 = 0;
            while (true) {
                setvideostabilizationmode.b = i16;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i16 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0849  */
    /* JADX WARN: Code duplicated, block: B:77:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x08f3 A[LOOP:0: B:80:0x08f0->B:82:0x08f3, LOOP_END] */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        char c;
        int i;
        int i2;
        ArrayList arrayList;
        String[] strArr;
        int i3;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
            int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) 15, $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, tapTimeout, modifierMetaStateMask, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                int size = 23 - View.MeasureSpec.getSize(0);
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                c((short) 156, bArr[7], bArr[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, iAxisFromString, size, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.orderId).substring(0, 8).length() + 193765633;
            int i7 = ~length;
            int i8 = 1541093546 + (((~((-923835943) | i7)) | (-711233517)) * 519) + (((~(i7 | (-570461733))) | (~((-140771785) | length))) * (-519)) + (((~(length | (-711233517))) | 923835942) * 519) + 284626789;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{0, 16, 122, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{16, 16, 82, 8}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-155131395};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 42050), ((byte) KeyEvent.getModifierMetaStateMask()) + 1727, 29 - (Process.myTid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 284626789);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                    int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr2 = $$a;
                    Object[] objArr8 = new Object[1];
                    c((short) 156, bArr2[7], bArr2[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iArgb, packedPositionGroup, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{32, 22, 102, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{54, 15, 27, 15}, true, null, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c4 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                        int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        Object[] objArr11 = new Object[1];
                        c((short) 104, bArr3[7], bArr3[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, iLastIndexOf, longPressTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c5 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int jumpTapTimeout2 = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Object[] objArr12 = new Object[1];
                        c((short) 193, (byte) 15, $$a[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, absoluteGravity, jumpTapTimeout2, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i12 != i11) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList2.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i13 = i12 - 1;
            iArr[i13] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i13) % 2) - 1], 1).show();
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iMyPid = Process.myPid();
            int i15 = i14 + ((((~(1039513295 | iMyPid)) | 142704769) * 449) - 497226617) + (((~((~iMyPid) | 1039513295)) | 142704769) * 449);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = ~(215838714 | iIdentityHashCode);
            int i22 = i20 + (-84491027) + ((90112 | i21) * (-476)) + (i21 * 952) + ((~((~iIdentityHashCode) | 215838714)) * 476);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 16;
            byte[] bArr4 = $$a;
            Object[] objArr15 = new Object[1];
            c((short) 52, bArr4[7], bArr4[5], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, offsetBefore, iLastIndexOf2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{32, 22, 102, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{54, 15, 27, 15}, true, null, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int iMyTid = 1031 - (Process.myTid() >> 22);
            int iAxisFromString2 = 14 - MotionEvent.axisFromString("");
            byte[] bArr5 = $$a;
            Object[] objArr18 = new Object[1];
            c((short) 156, bArr5[7], bArr5[5], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask2, iMyTid, iAxisFromString2, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char modifierMetaStateMask3 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                byte b = $$a[7];
                short s = b;
                Object[] objArr19 = new Object[1];
                c(s, (byte) (s | 52), b, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(modifierMetaStateMask3, iIndexOf, bitsPerPixel, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr3 = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = (-1648014114) + (((~(539769894 | i27)) | 784050064) * (-90)) + (((~(539769894 | iIdentityHashCode2)) | 268326) * (-45)) + (((~(iIdentityHashCode2 | (-784050065))) | 539769894 | (~(i27 | 784050064))) * 45) + 35170008;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{0, 16, 122, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{16, 16, 82, 8}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-155131395};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1134, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 35170008, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c6 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 1032;
                int mode = 15 - View.MeasureSpec.getMode(0);
                byte[] bArr6 = $$a;
                Object[] objArr25 = new Object[1];
                c((short) 52, bArr6[7], bArr6[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c6, iLastIndexOf3, mode, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName("") + 45994), (-16776099) - Color.rgb(0, 0, 0), (Process.myTid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                int i31 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b2 = $$a[7];
                short s2 = b2;
                Object[] objArr26 = new Object[1];
                c(s2, (byte) (s2 | 52), b2, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, iResolveOpacity, i31, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{32, 22, 102, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{54, 15, 27, 15}, true, null, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int i32 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr7 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) 156, bArr7[7], bArr7[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maxKeyCode, maximumFlingVelocity, i32, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char size2 = (char) View.MeasureSpec.getSize(0);
                    int maxKeyCode2 = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                    int i33 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr8 = $$a;
                    byte b3 = bArr8[7];
                    byte b4 = bArr8[5];
                    Object[] objArr30 = new Object[1];
                    c((short) 52, b3, b4, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(size2, maxKeyCode2, i33, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                if (i34 % 2 != 0) {
                    c = 3;
                    int i35 = 4 / 3;
                }
                i = ((int[]) objArr[1])[0];
                i2 = ((int[]) objArr[c])[0];
                if (i2 == i) {
                    Object[] objArr31 = new Object[4];
                    objArr31[1] = new int[]{i};
                    objArr31[2] = new int[1];
                    objArr31[c] = new int[]{i};
                    int i36 = ((int[]) objArr[2])[0];
                    int i37 = ((int[]) objArr[c])[0];
                    int i38 = ((int[]) objArr[1])[0];
                    objArr31[0] = (String[]) objArr[0];
                    int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_transfer).substring(0, 12).length() + 1575717803;
                    int i39 = ~length2;
                    int i40 = i36 + (-513250338) + ((986874229 | i39) * (-757)) + ((~(1054054271 | length2)) * 1514) + (((~(length2 | (-67180043))) | (~(i39 | 742594059)) | 311460212) * 757);
                    int i41 = (i40 << 13) ^ i40;
                    int i42 = i41 ^ (i41 >>> 17);
                    ((int[]) objArr31[2])[0] = i42 ^ (i42 << 5);
                    return;
                }
                arrayList = new ArrayList();
                strArr = (String[]) objArr[0];
                if (strArr != null) {
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i43 = ((int[]) objArr[2])[0];
                int i44 = ((int[]) objArr[3])[0];
                int i45 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i46 = i43 + (-128011471) + (((~(iUptimeMillis | 637131225)) | 392851055) * (-668)) + ((637131225 | (~(392851055 | iUptimeMillis))) * 1336) + ((iUptimeMillis | 939261951) * 668);
                int i47 = i46 ^ (i46 << 13);
                int i48 = i47 ^ (i47 >>> 17);
                ((int[]) objArr32[2])[0] = i48 ^ (i48 << 5);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        c = 3;
        i = ((int[]) objArr[1])[0];
        i2 = ((int[]) objArr[c])[0];
        if (i2 == i) {
            Object[] objArr33 = new Object[4];
            objArr33[1] = new int[]{i38};
            objArr33[2] = new int[1];
            objArr33[c] = new int[]{i37};
            int i310 = ((int[]) objArr[2])[0];
            int i311 = ((int[]) objArr[c])[0];
            int i312 = ((int[]) objArr[1])[0];
            objArr33[0] = (String[]) objArr[0];
            int length3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_transfer).substring(0, 12).length() + 1575717803;
            int i313 = ~length3;
            int i49 = i310 + (-513250338) + ((986874229 | i313) * (-757)) + ((~(1054054271 | length3)) * 1514) + (((~(length3 | (-67180043))) | (~(i313 | 742594059)) | 311460212) * 757);
            int i410 = (i49 << 13) ^ i49;
            int i411 = i410 ^ (i410 >>> 17);
            ((int[]) objArr33[2])[0] = i411 ^ (i411 << 5);
            return;
        }
        arrayList = new ArrayList();
        strArr = (String[]) objArr[0];
        if (strArr != null) {
            while (i3 < strArr.length) {
                arrayList.add(str2);
            }
        }
        Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        Object[] objArr34 = {strArr4, new int[]{i45}, new int[1], new int[]{i44}};
        int i412 = ((int[]) objArr[2])[0];
        int i413 = ((int[]) objArr[3])[0];
        int i414 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i415 = i412 + (-128011471) + (((~(iUptimeMillis2 | 637131225)) | 392851055) * (-668)) + ((637131225 | (~(392851055 | iUptimeMillis2))) * 1336) + ((iUptimeMillis2 | 939261951) * 668);
        int i416 = i415 ^ (i415 << 13);
        int i417 = i416 ^ (i416 >>> 17);
        ((int[]) objArr34[2])[0] = i417 ^ (i417 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1014479401
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.AsikMembershipStatusActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 965529360;
        int i4 = ~i3;
        if (i2 != 1184485778 + (((~(i4 | (-1240938648))) | 1098981399 | (~((-268993857) | i3))) * 717) + (((~(i3 | (-1240938648))) | (~(i4 | (-268993857))) | 1098981399) * 717)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            int[] iArr = new int[3073314];
            iArr[3073313] = 1;
            int i7 = 622785378 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        if (i8 != (-357037496) + (((~((-45037933) | i9)) | 1760949263) * (-933)) + (((~(i9 | 1760949263)) | (-1795161456)) * 933) + 777674479) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            if (i10 % 2 == 0) {
                int[] iArr2 = new int[271230780];
                iArr2[271230779] = 0;
                Toast.makeText((Context) null, iArr2[-1], 0).show();
            } else {
                int[] iArr3 = new int[271230780];
                iArr3[271230779] = 1;
                int i11 = (-1127960876) % 2;
                Toast.makeText((Context) null, iArr3[-1], 1).show();
            }
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iMyPid = Process.myPid();
            int i4 = ~iMyPid;
            if (i3 != (-1187492200) + ((iMyPid | (-1666562628)) * 140) + (((~((-1666562628) | i4)) | 559225408) * (-280)) + (((~(iMyPid | (-559225409))) | (~(836575084 | i4)) | (-1943912304)) * 140)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            if (i5 != (-672366249) + (((~((~i6) | (-989440388))) | (-1819427931)) * (-235)) + (((~((-989440388) | i6)) | (-1819427931)) * (-470)) + (((~(i6 | (-678428675))) | (-2130439644)) * 235)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 279792165;
        if (i7 != 645208060 + (((~((-1738311813) | i8)) | 572295296) * 104) + ((~((~i8) | 2006760668)) * (-104)) + ((i8 | 840744152) * 104)) {
            int i9 = 1482641902 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikMembershipStatusActivity asikMembershipStatusActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        AsikResignProgramActivity.Companion companion = AsikResignProgramActivity.INSTANCE;
        AsikResignProgramActivity.Companion.TuitionPaymentFragmentbindingInflater1(asikMembershipStatusActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        g = 0;
        d();
        INSTANCE = new Companion(null);
        int i = asInterface + 77;
        g = i % 128;
        if (i % 2 != 0) {
            int i2 = 31 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentbindingInflater1(-718736687, 718736688, new Object[]{this}, cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), (-590883976) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2068565309);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentbindingInflater1(-1063028022, 1063028022, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 996060812, cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), cropJpegByteArray.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void d() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59769, 59860, 59886, 59886, 59850, 59852, 59883, 59882, 59887, 59855, 59825, 59883, 59899, 59878, 59885, 59880, 59758, 59843, 59851, 59851, 59848, 59824, 59837, 59827, 59826, 59837, 59824, 59808, 59820, 59828, 59831, 59821, 59747, 59846, 59844, 59864, 59830, 59829, 59844, 59865, 59858, 59863, 59847, 59821, 59837, 59868, 59839, 59812, 59847, 59865, 59869, 59866, 59844, 59846, 59787, 59779, 59791, 59780, 59788, 59767, 59787, 59750, 59764, 59787, 59781, 59776, 59767, 59788, 59787};
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, short r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.asik.AsikMembershipStatusActivity.$$c
            int r6 = r6 + 99
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L28:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.AsikMembershipStatusActivity.$$i(short, short, byte):java.lang.String");
    }
}
