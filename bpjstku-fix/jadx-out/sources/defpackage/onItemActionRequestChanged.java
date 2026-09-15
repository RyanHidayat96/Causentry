package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemEwalletBinding;
import com.bpjstku.domain.ewallet.model.EWalletService;
import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class onItemActionRequestChanged extends ListAdapter<EWalletService, TuitionPaymentFragmentbindingInflater1> {
    private final Function1<EWalletService, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Function1<EWalletService, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {74, 60, 122, -26, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 68, -7, 24, -10, 18, -4, -3, 16, -57, 58, 17, 2, 8, 8, -63, 76, 4, -6, 8, 2, 16, -6, 1, 19, -64, 40, 41, -15, 18, 11, -6, 22, -16, 18, -22, 35, -76, 36, 52, -8, 1, 24, -10, -30, 50, 14, -14, 19, -28, 24, 19, 7, -4, 13};
    private static final int $$e = 147;
    private static final byte[] $$a = {39, 27, 2, 54, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 97;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {31856, 64839, 32261, 65483, 30878, 64096, 31525, 62647, 30142, 63130, 28687, 61738, 29384, 62394, 28021, 60988, 28668, 59626, 27021, 60246, 25618, 58850, 45561, 12488, 45965, 12868, 46351, 14305, 46760, 14662, 47161, 15109, 48576, 15488, 48981, 15913, 41193, 45565, 12490, 45960, 12870, 46355, 14317, 46760, 14650, 47165, 15124, 48604, 15578, 49021, 15911, 41208, 9149, 41578, 9549, 42008, 9933, 43432, 10348, 43838, 11761, 44221, 12160, 55425, 22959, 56032, 23352, 56423, 24212, 57286, 20523, 53586, 21098, 54462, 21987, 54817, 22363, 51590, 19139, 51981, 19508};
    private static long b = -3053012389995204444L;

    private static void a(int i, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = b2 + 4;
        int i3 = 98 - (s * 14);
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i4)) - 10;
            i2 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i6])) - 10;
                i2 = i6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 98
            byte[] r0 = defpackage.onItemActionRequestChanged.$$d
            int r5 = r5 * 72
            int r5 = 73 - r5
            int r7 = r7 * 72
            int r7 = r7 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onItemActionRequestChanged.d(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0242  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c;
        int i2 = 2 % 2;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) viewHolder;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        final EWalletService eWalletService = getCurrentList().get(i);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 52, bArr[37], bArr[80], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, offsetAfter, doubleTapTimeout, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 52621), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(Color.alpha(0) + 22, 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr2[80], bArr2[37], bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMakeMeasureSpec, deadChar, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asInterface + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
                int iAlpha = 921 - Color.alpha(0);
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a((byte) (-bArr3[33]), (byte) 51, bArr3[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, iAlpha, defaultSize, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i5 = ~((int) Process.getElapsedCpuTime());
            int i6 = ((1377173819 + (((~(i5 | 138638775)) | (-1769733624)) * (-160))) + (((~(i5 | (-1635440869))) | 138638775) * 160)) - 1683518157;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(62 - ((byte) KeyEvent.getModifierMetaStateMask()), 18 - Color.argb(0, 0, 0, 0), (char) (27006 - TextUtils.getOffsetAfter("", 0)), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = asInterface + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, -1683518157};
                byte[] bArr4 = $$d;
                byte b2 = bArr4[20];
                Object[] objArr12 = new Object[1];
                d(b2, bArr4[44], b2, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b3 = bArr4[44];
                Object[] objArr13 = new Object[1];
                d(b3, bArr4[20], b3, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
                    int i13 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    a((byte) (-bArr5[33]), (byte) 51, bArr5[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iIndexOf, i13, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(View.resolveSize(0, 0), 22 - KeyEvent.keyCodeFromString(""), (char) (52621 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(TextUtils.indexOf("", "") + 22, Color.red(0) + 15, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
                        int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int gidForName = 27 - Process.getGidForName("");
                        byte[] bArr6 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr6[80], bArr6[37], bArr6[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, pressedStateDuration, gidForName, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                        int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        a((byte) 52, bArr7[37], bArr7[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, scrollBarSize, keyRepeatDelay, -1048449946, false, (String) objArr18[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode;
            int i20 = (~((-1705058213) | i19)) | 1637880064 | (~(69021431 | i19));
            int i21 = i18 + 668138833 + (((~(iIdentityHashCode | (-1843284))) | i20) * 590) + (i20 * (-1180)) + (((~((-69021432) | i19)) | (~(i19 | 1705058212))) * 590);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                    asInterface = i24 % 128;
                    int i25 = i24 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i26 = i15 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode2;
            int i29 = i27 + (-621983810) + (((~((-709006021) | i28)) | (~((-1583107) | iIdentityHashCode2)) | (~((-354484498) | iIdentityHashCode2))) * 765) + (((~((-710589127) | i28)) | 709006020) * 1530) + (((~(iIdentityHashCode2 | (-710589127))) | (~(i28 | (-354484498)))) * 765);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[0])[0] = i31 ^ (i31 << 5);
        }
        Intrinsics.checkNotNull(eWalletService);
        Intrinsics.checkNotNullParameter(eWalletService, "");
        ItemEwalletBinding itemEwalletBinding = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(itemEwalletBinding.getRoot()).load(Integer.valueOf(eWalletService.TuitionPaymentFragmentbindingInflater1)).d().into(itemEwalletBinding.itemEwalletLogo);
        itemEwalletBinding.itemEwalletTitle.setText(eWalletService.b);
        if (eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            asInterface = i32 % 128;
            int i33 = i32 % 2;
            MaterialCardView materialCardView = itemEwalletBinding.itemEwalletStatusLayout;
            Intrinsics.checkNotNullExpressionValue(materialCardView, "");
            materialCardView.setVisibility(8);
            MaterialButton materialButton = itemEwalletBinding.itemEwalletConnect;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setVisibility(8);
            TextView textView = itemEwalletBinding.itemEwalletPrice;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            ImageView imageView = itemEwalletBinding.itemEwalletAction;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            itemEwalletBinding.itemEwalletPrice.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
            c = 0;
        } else {
            TextView textView2 = itemEwalletBinding.itemEwalletPrice;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            ImageView imageView2 = itemEwalletBinding.itemEwalletAction;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            MaterialCardView materialCardView2 = itemEwalletBinding.itemEwalletStatusLayout;
            Intrinsics.checkNotNullExpressionValue(materialCardView2, "");
            c = 0;
            materialCardView2.setVisibility(0);
            MaterialButton materialButton2 = itemEwalletBinding.itemEwalletConnect;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "");
            materialButton2.setVisibility(0);
        }
        MaterialButton materialButton3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.itemEwalletConnect;
        int i34 = ((int[]) objArr2[c])[c];
        int i35 = i34 * i34;
        int i36 = -(161972516 * i34);
        int i37 = (i35 & i36) + (i35 | i36);
        int i38 = -(i34 * (-2134178774));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        int i40 = ((i39 | (-977762063)) << 1) - ((-977762063) ^ i39);
        int i41 = i40 >> 29;
        int i42 = (((i41 | (-15)) << 1) - (i41 ^ (-15))) / 8;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        int i44 = ((i40 | i43) << 1) - (i43 ^ i40);
        int i45 = i40 >> 21;
        int i46 = -(i44 ^ (((((i45 | (-4095)) << 1) - (i45 ^ (-4095))) / 2048) + 1));
        int i47 = (i46 ^ 2) + ((i46 & 2) << 1);
        int i48 = i47 >> 25;
        int i49 = ((((i48 | (-255)) << 1) - (i48 ^ (-255))) / 128) + 1;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "31\\3\\12\\itemEwalletConnect".substring(5344 / (((-((i49 & 1) + (i49 | 1))) & i47) * 334)));
        MaterialButton materialButton4 = materialButton3;
        Function1 function1 = new Function1() { // from class: performShortcut
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onItemActionRequestChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, eWalletService, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(materialButton4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        materialButton4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.itemEwalletAction;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: removeItemAt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onItemActionRequestChanged.b(this.TuitionPaymentFragmentbindingInflater1, eWalletService, (View) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemEwalletBinding itemEwalletBindingInflate = ItemEwalletBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemEwalletBindingInflate, "");
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(itemEwalletBindingInflate);
        int i3 = asInterface + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return tuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public onItemActionRequestChanged(List<EWalletService> list, Function1<? super EWalletService, Unit> function1, Function1<? super EWalletService, Unit> function2) {
        super(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
        submitList(list);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends DiffUtil.ItemCallback<EWalletService> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areContentsTheSame(EWalletService eWalletService, EWalletService eWalletService2) {
            EWalletService eWalletService3 = eWalletService;
            EWalletService eWalletService4 = eWalletService2;
            Intrinsics.checkNotNullParameter(eWalletService3, "");
            Intrinsics.checkNotNullParameter(eWalletService4, "");
            return eWalletService3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == eWalletService4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(eWalletService3.b, eWalletService4.b) && Intrinsics.areEqual(eWalletService3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, eWalletService4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areItemsTheSame(EWalletService eWalletService, EWalletService eWalletService2) {
            EWalletService eWalletService3 = eWalletService;
            EWalletService eWalletService4 = eWalletService2;
            Intrinsics.checkNotNullParameter(eWalletService3, "");
            Intrinsics.checkNotNullParameter(eWalletService4, "");
            return eWalletService3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == eWalletService4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends RecyclerView.ViewHolder {
        final ItemEwalletBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(ItemEwalletBinding itemEwalletBinding) {
            super(itemEwalletBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemEwalletBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemEwalletBinding;
        }
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 23;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i * i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2188, 40 - ((Process.getThreadPriority(0) + 20) >> 6), 841711447, false, $$g(b2, b2, $$c[2]), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 33017), TextUtils.indexOf((CharSequence) "", '0') + 3012, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - Color.blue(0)), Color.red(0) + 3376, 17 - ExpandableListView.getPackedPositionGroup(0L), -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 2187 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.keyCodeFromString("") + 40, 841711447, false, $$g(b7, b7, $$c[2]), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33016 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3010, 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 321985076, false, $$g(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 3375 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 18, -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 27;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 36505), (ViewConfiguration.getTapTimeout() >> 16) + 3376, TextUtils.lastIndexOf("", '0', 0, 0) + 18, -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    int i8 = 25 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", '0', 0, 0)), 3375 - MotionEvent.axisFromString(""), (ViewConfiguration.getTouchSlop() >> 8) + 17, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onItemActionRequestChanged onitemactionrequestchanged, EWalletService eWalletService, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            Function1<EWalletService, Unit> function1 = onitemactionrequestchanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(eWalletService);
            function1.invoke(eWalletService);
            return Unit.INSTANCE;
        }
        Function1<EWalletService, Unit> function2 = onitemactionrequestchanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(eWalletService);
        function2.invoke(eWalletService);
        int i4 = 1 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(onItemActionRequestChanged onitemactionrequestchanged, EWalletService eWalletService, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            Function1<EWalletService, Unit> function1 = onitemactionrequestchanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNull(eWalletService);
            function1.invoke(eWalletService);
            return Unit.INSTANCE;
        }
        Function1<EWalletService, Unit> function2 = onitemactionrequestchanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNull(eWalletService);
        function2.invoke(eWalletService);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String $$g(short s, short s2, int i) {
        int i2 = (s2 * 3) + 4;
        int i3 = s * 3;
        int i4 = 115 - (i * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + (-i3);
        }
        while (true) {
            int i6 = i4;
            int i7 = i2;
            i5++;
            bArr2[i5] = (byte) i6;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 = i7 + 1;
            i4 = i6 + (-bArr[i7]);
        }
    }
}
