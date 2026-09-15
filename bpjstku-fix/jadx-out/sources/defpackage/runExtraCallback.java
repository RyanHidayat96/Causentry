package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.data.openbanking.model.ListBank;
import com.bpjstku.databinding.ItemListBankBinding;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.installations.interop.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"LrunExtraCallback;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/data/openbanking/model/ListBank;", "LrunExtraCallback$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LrunExtraCallback$b;", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class runExtraCallback extends setVirtualCameraRotationDegrees<ListBank, b> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<ListBank, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ runExtraCallback(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private runExtraCallback(Context context, List<ListBank> list, Function1<? super ListBank, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    private b TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListBankBinding itemListBankBindingInflate = ItemListBankBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListBankBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemListBankBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<ListBank> {
        private final ItemListBankBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ runExtraCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(runExtraCallback runextracallback, ItemListBankBinding itemListBankBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListBankBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = runextracallback;
            Context context = runextracallback.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemListBankBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemListBankBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListBank listBank) {
            final ListBank listBank2 = listBank;
            Intrinsics.checkNotNullParameter(listBank2, "");
            ItemListBankBinding itemListBankBinding = this.TuitionPaymentFragmentbindingInflater1;
            final runExtraCallback runextracallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            itemListBankBinding.imgBank.setImageResource(listBank2.getImage());
            itemListBankBinding.tvTitleBank.setText(listBank2.getTitle());
            itemListBankBinding.arrowAction.setOnClickListener(new View.OnClickListener() { // from class: layoutInDisplayCutoutMode
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {42, -104, -68, 105, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
                private static final int $$b = 168;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                private static int b = 1;
                private static long TuitionPaymentFragmentbindingInflater1 = 6535570453418056428L;

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 + 4
                        int r7 = r7 * 14
                        int r7 = 98 - r7
                        byte[] r0 = defpackage.layoutInDisplayCutoutMode.$$a
                        int r1 = r8 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L13
                        r4 = r7
                        r3 = r2
                        r7 = r6
                        goto L28
                    L13:
                        r3 = r2
                        r5 = r7
                        r7 = r6
                        r6 = r5
                    L17:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        if (r3 != r8) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L24:
                        int r3 = r3 + 1
                        r4 = r0[r7]
                    L28:
                        int r4 = -r4
                        int r6 = r6 + r4
                        int r7 = r7 + 1
                        int r6 = r6 + (-11)
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.layoutInDisplayCutoutMode.c(short, byte, byte, java.lang.Object[]):void");
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = 2 % 2;
                    int i2 = b + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                    runExtraCallback runextracallback2 = runextracallback;
                    if (i3 == 0) {
                        runExtraCallback.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(runextracallback2, listBank2, view);
                        return;
                    }
                    runExtraCallback.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(runextracallback2, listBank2, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                    int i2 = 2 % 2;
                    getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                    getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                    int length = cArr.length;
                    long[] jArr = new long[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i3 = $11 + 53;
                        $10 = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = getrealtimecapturelatency.b;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') + 19424), 2624 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - (ViewConfiguration.getEdgeSlop() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (TuitionPaymentFragmentbindingInflater1 + 9053247990562531611L);
                                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39470 - AndroidCharacter.getMirror('0')), 481 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 37 - TextUtils.indexOf("", "", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            int i5 = getrealtimecapturelatency.b;
                            Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 19472), AndroidCharacter.getMirror('0') + 2576, 13 - (ViewConfiguration.getTouchSlop() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getSize(0) + 39422), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 481, 37 - TextUtils.indexOf("", ""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                    }
                    char[] cArr2 = new char[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i6 = $10 + 63;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 39422), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 481, TextUtils.indexOf("", "", 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                        int i8 = $11 + 83;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    objArr[0] = new String(cArr2);
                }

                /* JADX WARN: Code duplicated, block: B:111:0x02fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:37:0x0291  */
                /* JADX WARN: Code duplicated, block: B:39:0x02a3  */
                /* JADX WARN: Code duplicated, block: B:48:0x0301 A[Catch: Exception -> 0x0543, TRY_LEAVE, TryCatch #4 {Exception -> 0x0543, blocks: (B:46:0x02fb, B:48:0x0301), top: B:111:0x02fb }] */
                /* JADX WARN: Code duplicated, block: B:51:0x0327 A[Catch: all -> 0x041e, TryCatch #5 {all -> 0x041e, blocks: (B:49:0x031a, B:51:0x0327, B:52:0x0365), top: B:113:0x031a, outer: #3 }] */
                /* JADX WARN: Code duplicated, block: B:60:0x0429 A[Catch: Exception -> 0x0545, TRY_LEAVE, TryCatch #3 {Exception -> 0x0545, blocks: (B:54:0x03b9, B:56:0x041f, B:58:0x0427, B:59:0x0428, B:60:0x0429, B:65:0x0513, B:74:0x053b, B:76:0x0541, B:77:0x0542, B:61:0x04c6, B:63:0x04d3, B:64:0x050c, B:49:0x031a, B:51:0x0327, B:52:0x0365), top: B:110:0x02ff, inners: #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:63:0x04d3 A[Catch: all -> 0x053a, TryCatch #2 {all -> 0x053a, blocks: (B:61:0x04c6, B:63:0x04d3, B:64:0x050c), top: B:108:0x04c6, outer: #3 }] */
                /* JADX WARN: Code duplicated, block: B:69:0x051b  */
                /* JADX WARN: Code duplicated, block: B:71:0x0536  */
                /* JADX WARN: Code duplicated, block: B:79:0x0545 A[PHI: r28
  0x0545: PHI (r28v2 ??) = (r28v1 ??), (r28v4 ??), (r28v5 ??) binds: [B:78:0x0543, B:103:0x0545, B:67:0x0518] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:82:0x0559  */
                /* JADX WARN: Code duplicated, block: B:83:0x055c  */
                /* JADX WARN: Code duplicated, block: B:86:0x057e  */
                /* JADX WARN: Code duplicated, block: B:87:0x0584  */
                /* JADX WARN: Code duplicated, block: B:90:0x05b2  */
                /* JADX WARN: Code duplicated, block: B:91:0x05c1  */
                /* JADX WARN: Code duplicated, block: B:94:0x0678  */
                /* JADX WARN: Code duplicated, block: B:95:0x0685  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r28v0, types: [android.content.Context, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r28v1 */
                /* JADX WARN: Type inference failed for: r28v10 */
                /* JADX WARN: Type inference failed for: r28v11 */
                /* JADX WARN: Type inference failed for: r28v12 */
                /* JADX WARN: Type inference failed for: r28v13 */
                /* JADX WARN: Type inference failed for: r28v2 */
                /* JADX WARN: Type inference failed for: r28v3 */
                /* JADX WARN: Type inference failed for: r28v4 */
                /* JADX WARN: Type inference failed for: r28v5 */
                /* JADX WARN: Type inference failed for: r28v7 */
                /* JADX WARN: Type inference failed for: r28v8 */
                /* JADX WARN: Type inference failed for: r28v9 */
                /* JADX WARN: Type inference failed for: r2v52 */
                /* JADX WARN: Type inference failed for: r3v51 */
                public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                    int i4;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i5;
                    ?? r28;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    String str;
                    Object[] objArr;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i13;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    ?? r29;
                    int i14;
                    Object[] objArr2;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20 = 2 % 2;
                    int i21 = b;
                    int i22 = (i21 ^ 7) + ((i21 & 7) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = i21 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                    int i25 = i24 % 2;
                    if (context != 0) {
                        int i26 = i21 + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                        if (i26 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        try {
                            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            int i27 = keyRepeatTimeout * (-337);
                            int i28 = (i27 & 7888191) + (i27 | 7888191);
                            int i29 = ~keyRepeatTimeout;
                            int i30 = ~i;
                            int i31 = ~((i29 ^ i30) | (i29 & i30));
                            int i32 = ~(((-23270) ^ keyRepeatTimeout) | ((-23270) & keyRepeatTimeout));
                            int i33 = (i31 ^ i32) | (i31 & i32);
                            int i34 = ~(keyRepeatTimeout | i);
                            int i35 = i28 + (((i33 ^ i34) | (i33 & i34)) * (-338));
                            int i36 = (~((i29 ^ 23269) | (i29 & 23269))) * 338;
                            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                            int i38 = ~keyRepeatTimeout;
                            int i39 = ~((i38 & i30) | (i38 ^ i30));
                            int i40 = ~((keyRepeatTimeout & 23269) | (keyRepeatTimeout ^ 23269) | i);
                            int i41 = ((i39 & i40) | (i39 ^ i40)) * 338;
                            int i42 = (i37 ^ i41) + ((i41 & i37) << 1);
                            Object[] objArr3 = new Object[1];
                            a(new char[]{13206, 27004, 34393, 9002, 22540, 62951, 4813, 20378, 58556, 405, 49003, 54356, 28974, 44600, 51973, 24754, 40420, 15021, 22403, 36220, 10870, 18246, 64557}, i42, objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            char[] cArr = {13200, 32913, 21893, 10943, 65419, 19592, 393, 54923, 43916, 30861, 52637, 33471, 22460, 9406, 63892, 20148, 929, 53419};
                            int trimmedLength = TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentbindingInflater1 = R.style.TuitionPaymentFragmentbindingInflater1();
                            int i43 = ~trimmedLength;
                            int i44 = ~((i43 ^ (-45828)) | (i43 & (-45828)));
                            int i45 = ~trimmedLength;
                            int i46 = (~((i45 ^ iTuitionPaymentFragmentbindingInflater1) | (i45 & iTuitionPaymentFragmentbindingInflater1))) | i44;
                            int i47 = b;
                            int i48 = i47 + 115;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                            int i49 = i48 % 2;
                            int i50 = (((trimmedLength * 881) - (-40373587)) - (~((-880) * (i46 | (~(((-45828) ^ iTuitionPaymentFragmentbindingInflater1) | ((-45828) & iTuitionPaymentFragmentbindingInflater1))))))) - 1;
                            int i51 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i52 = ~((i51 & i43) | (i43 ^ i51));
                            int i53 = (i52 & 45827) | (45827 ^ i52);
                            int i54 = (trimmedLength & iTuitionPaymentFragmentbindingInflater1) | (trimmedLength ^ iTuitionPaymentFragmentbindingInflater1);
                            int i55 = ~i54;
                            int i56 = -(-(((i53 & i55) | (i53 ^ i55)) * (-880)));
                            int i57 = (i50 ^ i56) + ((i56 & i50) << 1);
                            int i58 = (i47 & 87) + (i47 | 87);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i58 % 128;
                            int i59 = i58 % 2;
                            int i60 = (i57 - (~(-(-(880 * (~i54)))))) - 1;
                            Object[] objArr4 = new Object[1];
                            a(cArr, i60, objArr4);
                            Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                            int i61 = -TextUtils.indexOf((CharSequence) "", '0');
                            int i62 = (i61 ^ 55660) + ((i61 & 55660) << 1);
                            Object[] objArr5 = new Object[1];
                            a(new char[]{13206, 60148, 33097, 49090, 22060, 3263, 11037, 49698, 63740, 38733, 19931, 25644, 654, 14608, 53365, 36538, 42327, 17319, 31347, 4257, 52995, 58998, 40133, 47957, 20908, 2099, 9873, 56801, 62580, 37568, 18808, 26538, 7729, 13461}, i62, objArr5);
                            Class<?> cls2 = Class.forName((String) objArr5[0]);
                            int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                            b = i63 % 128;
                            int i64 = i63 % 2;
                            int i65 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i66 = (929 & i65) + (i65 | 929);
                            Object[] objArr6 = new Object[1];
                            a(new char[]{13201, 12346, 13524, 14707, 15616}, i66, objArr6);
                            int i67 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                            int i68 = (i67 | (-i67)) >> 31;
                            int i69 = (~i68) & i;
                            int i70 = b + 67;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i70 % 128;
                            int i71 = i70 % 2;
                            int i72 = i68 & ((i & (-2)) | (i30 & 1));
                            i4 = (i72 & i69) | (i69 ^ i72);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        i4 = i;
                    }
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (16949 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int iArgb = Color.argb(0, 0, 0, 0) + 2739;
                            int i73 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12;
                            byte[] bArr = $$a;
                            Object[] objArr7 = new Object[1];
                            c(bArr[7], bArr[5], (byte) 52, objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iArgb, i73, 1501733736, false, (String) objArr7[0], new Class[0]);
                        }
                        Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                        int i74 = b + 73;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i74 % 128;
                        if (i74 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char keyRepeatDelay = (char) (16949 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                int iResolveSizeAndState = 2739 - View.resolveSizeAndState(0, 0, 0);
                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 13;
                                Object[] objArr8 = new Object[1];
                                c((short) 52, $$a[5], (byte) 52, objArr8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, iResolveSizeAndState, maxKeyCode, 47863026, false, (String) objArr8[0], null);
                            }
                            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                                int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                                b = i75 % 128;
                                int i76 = i75 % 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char fadingEdgeLength = (char) (16949 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                    int iIndexOf = 2739 - TextUtils.indexOf("", "", 0);
                                    int iGreen = Color.green(0) + 13;
                                    byte[] bArr2 = $$a;
                                    short s = (short) (-bArr2[1]);
                                    byte b2 = bArr2[5];
                                    Object[] objArr9 = new Object[1];
                                    c(s, b2, (byte) (b2 | 36), objArr9);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iIndexOf, iGreen, 631063962, false, (String) objArr9[0], null);
                                }
                                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null))) {
                                    if (Build.VERSION.SDK_INT > 33) {
                                        Object[] objArr10 = new Object[1];
                                        a(new char[]{13272, 58833, 40709, 45405, 27348, 7377, 13835, 59467, 33179, 48003, 27909, 1914, 14520, 54004, 33904, 48766, 22434, 2534, 9012, 54633, 36524, 41193, 23127, 29598, 9690, 57170, 61771, 43653}, 54851 - View.MeasureSpec.getMode(0), objArr10);
                                        Object[] objArr11 = {(String) objArr10[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 994;
                                            int i77 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7;
                                            byte b3 = $$a[7];
                                            Object[] objArr12 = new Object[1];
                                            c((short) 141, b3, b3, objArr12);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iIndexOf2, i77, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                                        long j = 1138337725;
                                        r28 = i4;
                                        long j2 = -1;
                                        long j3 = j ^ j2;
                                        long j4 = i;
                                        long j5 = j4 ^ j2;
                                        long j6 = (((long) 55) * j) + (((long) (-107)) * jLongValue) + (((long) (-108)) * (((j3 | jLongValue) ^ j2) | ((j5 | jLongValue) ^ j2)));
                                        long j7 = 54;
                                        long j8 = ((jLongValue ^ j2) | j) ^ j2;
                                        long j9 = j6 + ((((j3 | j4) ^ j2) | j8 | (j2 ^ (j5 | j))) * j7) + (j7 * (j4 | j8)) + ((long) (-1339255962));
                                        int i78 = (int) (j9 >> 32);
                                        int iNextInt = new Random().nextInt();
                                        int i79 = ~iNextInt;
                                        int i80 = i78 & (1928006403 + (((~((-566516162) | i79)) | (~((-33619977) | iNextInt)) | (~((-270574113) | iNextInt))) * 765) + (((~((-600136138) | i79)) | 566516161) * 1530) + (((~(iNextInt | (-600136138))) | (~(i79 | (-270574113)))) * 765));
                                        int i81 = ~i;
                                        i5 = i80 | (((int) j9) & (1168364688 + (((~(1523859847 | i81)) | (~((-86633438) | i))) * 217) + (((~(1523859847 | i)) | 86616664) * 217) + (((~(i81 | (-86633438))) | (-1523859848)) * 217)));
                                    } else {
                                        context = i4;
                                        int i82 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i83 = (i ^ 60763) | (i & 60763);
                                        int i84 = ~i82;
                                        int i85 = (((i82 * (-380)) + 23211466) - (~(((i83 & i84) | (i83 ^ i84)) * (-381)))) - 1;
                                        int i86 = ~i82;
                                        int i87 = ~(((-60764) & i86) | (i86 ^ (-60764)));
                                        int i88 = ~i;
                                        int i89 = ~((i88 ^ 60763) | (i88 & 60763));
                                        int i90 = (i87 & i89) | (i87 ^ i89);
                                        int i91 = ~(i82 | 60763);
                                        int i92 = i85 + (((i91 & i90) | (i90 ^ i91)) * 381) + ((~(i86 | 60763)) * 381);
                                        Object[] objArr13 = new Object[1];
                                        a(new char[]{13254}, i92, objArr13);
                                        str = (String) objArr13[0];
                                        int i93 = -Drawable.resolveOpacity(0, 0);
                                        int i94 = i93 * (-494);
                                        int i95 = ((((((i94 | (-29660254)) << 1) - (i94 ^ (-29660254))) - (~((~(60041 | i93)) * (-495)))) - 1) - (~(-(-(((~i) | i93) * 495))))) - 1;
                                        int i96 = ~((~i93) | (-60042));
                                        int i97 = ~((i93 & i88) | (i88 ^ i93));
                                        int i98 = -(-(((i97 & i96) | (i96 ^ i97)) * 495));
                                        int i99 = (i95 & i98) + (i98 | i95);
                                        Object[] objArr14 = new Object[1];
                                        a(new char[]{13189, 55569, 59083, 35848, 39350, 42808, 19636, 23087, 26584, 3399, 6863, 8312, 52734}, i99, objArr14);
                                        objArr = new Object[]{(String) objArr14[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cRgb = (char) ((-16743614) - Color.rgb(0, 0, 0));
                                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                            int iAlpha = 26 - Color.alpha(0);
                                            byte b4 = $$a[7];
                                            Object[] objArr15 = new Object[1];
                                            c((short) 141, b4, b4, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, scrollBarFadeDuration, iAlpha, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                                        }
                                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr))) {
                                            i5 = 0;
                                            r28 = context;
                                        } else {
                                            int i100 = b;
                                            int i101 = (i100 ^ 27) + ((i100 & 27) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                                            int i102 = i101 % 2;
                                            i13 = (i100 ^ 17) + ((i100 & 17) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                int i103 = 4 / 2;
                                            }
                                            i5 = 1;
                                            r28 = context;
                                        }
                                    }
                                    int i104 = i ^ 10;
                                    i6 = i5 | (-i5);
                                    int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i7 = (i105 & 87) + (i105 | 87);
                                    int i106 = i7 % 128;
                                    b = i106;
                                    if (i7 % 2 == 0) {
                                        i8 = i6 + 31;
                                    } else {
                                        i8 = i6 >> 31;
                                    }
                                    int i107 = (~i8) & i;
                                    int i108 = i8 & i104;
                                    int i109 = (i108 & i107) | (i107 ^ i108);
                                    int i110 = i2 & 32;
                                    int i111 = (i110 | (-i110)) >> 31;
                                    int i112 = (i106 ^ 21) + ((i106 & 21) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
                                    i9 = i112 % 2;
                                    i10 = i109 & (~i111);
                                    i11 = i111 & i;
                                    if (i9 != 0) {
                                        i12 = i10 | i11;
                                        int i113 = 18 / 0;
                                        r29 = r28;
                                    } else {
                                        i12 = (i10 & i11) | (i10 ^ i11);
                                        r29 = r28;
                                    }
                                }
                            }
                            int i114 = (~((i & r29) == true ? 1 : 0)) & ((i | r29) == true ? 1 : 0);
                            int i115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                            int i116 = i115 % 128;
                            b = i116;
                            int i117 = i115 % 2;
                            int i118 = (i114 | (-i114)) >> 31;
                            i14 = (i12 & (~i118)) | (r29 & i118);
                            objArr2 = new Object[4];
                            i15 = (i116 ^ 17) + ((i116 & 17) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                            if (i15 % 2 != 0) {
                                objArr2[1] = new int[1];
                                objArr2[0] = new int[1];
                                objArr2[5] = new int[0];
                            } else {
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[1];
                                objArr2[2] = new int[1];
                            }
                            int i119 = ~i;
                            int i120 = ~((-859883314) | i119);
                            int i121 = (i120 & 843072257) | (i120 ^ 843072257);
                            int i122 = ~(((-1275607169) & i) | ((-1275607169) ^ i));
                            int i123 = ((i121 & i122) | (i121 ^ i122)) * (-713);
                            int i124 = (((((-1302411990) | i123) << 1) - (i123 ^ (-1302411990))) - (~(-(-((~(((-1275607169) & i) | ((-1275607169) ^ i))) * 1426))))) - 1;
                            int i125 = ~i;
                            i16 = (i124 - (~((~((i125 & (-1292418225)) | ((-1292418225) ^ i125))) * 713))) - 1;
                            int iTuitionPaymentFragmentbindingInflater2 = R.style.TuitionPaymentFragmentbindingInflater1();
                            int i126 = ~iTuitionPaymentFragmentbindingInflater2;
                            int i127 = ~(((-1668029107) & i126) | ((-1668029107) ^ i126));
                            int i128 = ~iTuitionPaymentFragmentbindingInflater2;
                            int i129 = (i127 & 1080564402) | (1080564402 ^ i127) | (~(((-1080736695) & i128) | ((-1080736695) ^ i128)));
                            int i130 = ~((1668201398 & iTuitionPaymentFragmentbindingInflater2) | (1668201398 ^ iTuitionPaymentFragmentbindingInflater2));
                            int i131 = 1716859015 - (~(-(-(((i129 & i130) | (i129 ^ i130)) * (-84)))));
                            int i132 = ~((iTuitionPaymentFragmentbindingInflater2 & (-1080736695)) | ((-1080736695) ^ iTuitionPaymentFragmentbindingInflater2));
                            int i133 = (i132 & 1668029106) | (1668029106 ^ i132);
                            int i134 = ~((i128 & 1080736694) | (i128 ^ 1080736694));
                            int i135 = i131 + (((i133 & i134) | (i133 ^ i134)) * (-84));
                            int i136 = ~((i126 ^ 1080736694) | (i126 & 1080736694));
                            int i137 = ((i136 & (-1668201399)) | (i136 ^ (-1668201399))) * 84;
                            i17 = ((i135 | i137) << 1) - (i137 ^ i135);
                            i18 = ~(i & i14);
                            if (i16 > i17) {
                                int i138 = i18 & (i | i14);
                                int i139 = -i138;
                                i19 = (((i138 & i139) | (i138 ^ i139)) + 71) & 74;
                            } else {
                                int i140 = i18 & (i | i14);
                                int i141 = -i140;
                                i19 = (((i140 & i141) | (i140 ^ i141)) >> 31) & 16;
                            }
                            ((int[]) objArr2[0])[0] = i;
                            ((int[]) objArr2[2])[0] = i14;
                            objArr2[3] = null;
                            int i142 = 1397177788 + ((i | (-654491214)) * 140) + (((~((-654491214) | i119)) | 553686016) * (-280)) + (((~(694801442 | i119)) | (-795606640) | (~(i | (-553686017)))) * 140);
                            int i143 = -(-i19);
                            int i144 = -(-((i142 & i143) + (i143 | i142)));
                            int i145 = ((i3 | i144) << 1) - (i3 ^ i144);
                            int i146 = (i145 << 13) ^ i145;
                            int i147 = i146 >>> 17;
                            int i148 = ((~i146) & i147) | ((~i147) & i146);
                            int i149 = i148 << 5;
                            ((int[]) objArr2[1])[0] = ((~i148) & i149) | ((~i149) & i148);
                            return objArr2;
                        }
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) (16949 - Color.alpha(0));
                            int absoluteGravity = 2739 - Gravity.getAbsoluteGravity(0, 0);
                            int iAxisFromString = MotionEvent.axisFromString("") + 14;
                            Object[] objArr16 = new Object[1];
                            c((short) 52, $$a[5], (byte) 52, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, absoluteGravity, iAxisFromString, 47863026, false, (String) objArr16[0], null);
                        }
                        boolean zContains = set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null));
                        int i150 = 32 / 0;
                        if (!zContains) {
                            int i710 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                            b = i710 % 128;
                            int i711 = i710 % 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char fadingEdgeLength2 = (char) (16949 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int iIndexOf3 = 2739 - TextUtils.indexOf("", "", 0);
                                int iGreen2 = Color.green(0) + 13;
                                byte[] bArr3 = $$a;
                                short s2 = (short) (-bArr3[1]);
                                byte b5 = bArr3[5];
                                Object[] objArr17 = new Object[1];
                                c(s2, b5, (byte) (b5 | 36), objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength2, iIndexOf3, iGreen2, 631063962, false, (String) objArr17[0], null);
                            }
                            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null))) {
                                try {
                                    try {
                                        if (Build.VERSION.SDK_INT > 33) {
                                            Object[] objArr18 = new Object[1];
                                            a(new char[]{13272, 58833, 40709, 45405, 27348, 7377, 13835, 59467, 33179, 48003, 27909, 1914, 14520, 54004, 33904, 48766, 22434, 2534, 9012, 54633, 36524, 41193, 23127, 29598, 9690, 57170, 61771, 43653}, 54851 - View.MeasureSpec.getMode(0), objArr18);
                                            try {
                                                Object[] objArr19 = {(String) objArr18[0]};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 994;
                                                    int i712 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7;
                                                    byte b6 = $$a[7];
                                                    Object[] objArr110 = new Object[1];
                                                    c((short) 141, b6, b6, objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror2, iIndexOf4, i712, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                                                }
                                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                long j10 = 1138337725;
                                                r28 = i4;
                                                long j11 = -1;
                                                long j12 = j10 ^ j11;
                                                long j13 = i;
                                                long j14 = j13 ^ j11;
                                                long j15 = (((long) 55) * j10) + (((long) (-107)) * jLongValue2) + (((long) (-108)) * (((j12 | jLongValue2) ^ j11) | ((j14 | jLongValue2) ^ j11)));
                                                long j16 = 54;
                                                long j17 = ((jLongValue2 ^ j11) | j10) ^ j11;
                                                long j18 = j15 + ((((j12 | j13) ^ j11) | j17 | (j11 ^ (j14 | j10))) * j16) + (j16 * (j13 | j17)) + ((long) (-1339255962));
                                                int i713 = (int) (j18 >> 32);
                                                int iNextInt2 = new Random().nextInt();
                                                int i714 = ~iNextInt2;
                                                int i810 = i713 & (1928006403 + (((~((-566516162) | i714)) | (~((-33619977) | iNextInt2)) | (~((-270574113) | iNextInt2))) * 765) + (((~((-600136138) | i714)) | 566516161) * 1530) + (((~(iNextInt2 | (-600136138))) | (~(i714 | (-270574113)))) * 765));
                                                int i811 = ~i;
                                                i5 = i810 | (((int) j18) & (1168364688 + (((~(1523859847 | i811)) | (~((-86633438) | i))) * 217) + (((~(1523859847 | i)) | 86616664) * 217) + (((~(i811 | (-86633438))) | (-1523859848)) * 217)));
                                            } catch (Throwable th2) {
                                                Throwable cause2 = th2.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th2;
                                            }
                                        } else {
                                            context = i4;
                                            int i812 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i813 = (i ^ 60763) | (i & 60763);
                                            int i814 = ~i812;
                                            int i815 = (((i812 * (-380)) + 23211466) - (~(((i813 & i814) | (i813 ^ i814)) * (-381)))) - 1;
                                            int i816 = ~i812;
                                            int i817 = ~(((-60764) & i816) | (i816 ^ (-60764)));
                                            int i818 = ~i;
                                            int i819 = ~((i818 ^ 60763) | (i818 & 60763));
                                            int i910 = (i817 & i819) | (i817 ^ i819);
                                            int i911 = ~(i812 | 60763);
                                            int i912 = i815 + (((i911 & i910) | (i910 ^ i911)) * 381) + ((~(i816 | 60763)) * 381);
                                            Object[] objArr111 = new Object[1];
                                            a(new char[]{13254}, i912, objArr111);
                                            str = (String) objArr111[0];
                                            int i913 = -Drawable.resolveOpacity(0, 0);
                                            int i914 = i913 * (-494);
                                            int i915 = ((((((i914 | (-29660254)) << 1) - (i914 ^ (-29660254))) - (~((~(60041 | i913)) * (-495)))) - 1) - (~(-(-(((~i) | i913) * 495))))) - 1;
                                            int i916 = ~((~i913) | (-60042));
                                            int i917 = ~((i913 & i818) | (i818 ^ i913));
                                            int i918 = -(-(((i917 & i916) | (i916 ^ i917)) * 495));
                                            int i919 = (i915 & i918) + (i918 | i915);
                                            Object[] objArr112 = new Object[1];
                                            a(new char[]{13189, 55569, 59083, 35848, 39350, 42808, 19636, 23087, 26584, 3399, 6863, 8312, 52734}, i919, objArr112);
                                            try {
                                                objArr = new Object[]{(String) objArr112[0]};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cRgb2 = (char) ((-16743614) - Color.rgb(0, 0, 0));
                                                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                                    int iAlpha2 = 26 - Color.alpha(0);
                                                    byte b7 = $$a[7];
                                                    Object[] objArr113 = new Object[1];
                                                    c((short) 141, b7, b7, objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb2, scrollBarFadeDuration2, iAlpha2, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                                                }
                                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr))) {
                                                    i5 = 0;
                                                    r28 = context;
                                                } else {
                                                    int i1010 = b;
                                                    int i1011 = (i1010 ^ 27) + ((i1010 & 27) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1011 % 128;
                                                    int i1012 = i1011 % 2;
                                                    i13 = (i1010 ^ 17) + ((i1010 & 17) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                                                    if (i13 % 2 != 0) {
                                                        int i1013 = 4 / 2;
                                                    }
                                                    i5 = 1;
                                                    r28 = context;
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                    context = i4;
                                }
                                int i1014 = i ^ 10;
                                i6 = i5 | (-i5);
                                int i1015 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i7 = (i1015 & 87) + (i1015 | 87);
                                int i1016 = i7 % 128;
                                b = i1016;
                                if (i7 % 2 == 0) {
                                    i8 = i6 + 31;
                                } else {
                                    i8 = i6 >> 31;
                                }
                                int i1017 = (~i8) & i;
                                int i1018 = i8 & i1014;
                                int i1019 = (i1018 & i1017) | (i1017 ^ i1018);
                                int i1110 = i2 & 32;
                                int i1111 = (i1110 | (-i1110)) >> 31;
                                int i1112 = (i1016 ^ 21) + ((i1016 & 21) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1112 % 128;
                                i9 = i1112 % 2;
                                i10 = i1019 & (~i1111);
                                i11 = i1111 & i;
                                if (i9 != 0) {
                                    i12 = i10 | i11;
                                    int i1113 = 18 / 0;
                                    r29 = r28;
                                } else {
                                    i12 = (i10 & i11) | (i10 ^ i11);
                                    r29 = r28;
                                }
                            }
                        }
                        int i1114 = (~((i & r29) == true ? 1 : 0)) & ((i | r29) == true ? 1 : 0);
                        int i1115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                        int i1116 = i1115 % 128;
                        b = i1116;
                        int i1117 = i1115 % 2;
                        int i1118 = (i1114 | (-i1114)) >> 31;
                        i14 = (i12 & (~i1118)) | (r29 & i1118);
                        objArr2 = new Object[4];
                        i15 = (i1116 ^ 17) + ((i1116 & 17) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        if (i15 % 2 != 0) {
                            objArr2[1] = new int[1];
                            objArr2[0] = new int[1];
                            objArr2[5] = new int[0];
                        } else {
                            objArr2[0] = new int[1];
                            objArr2[1] = new int[1];
                            objArr2[2] = new int[1];
                        }
                        int i1119 = ~i;
                        int i1210 = ~((-859883314) | i1119);
                        int i1211 = (i1210 & 843072257) | (i1210 ^ 843072257);
                        int i1212 = ~(((-1275607169) & i) | ((-1275607169) ^ i));
                        int i1213 = ((i1211 & i1212) | (i1211 ^ i1212)) * (-713);
                        int i1214 = (((((-1302411990) | i1213) << 1) - (i1213 ^ (-1302411990))) - (~(-(-((~(((-1275607169) & i) | ((-1275607169) ^ i))) * 1426))))) - 1;
                        int i1215 = ~i;
                        i16 = (i1214 - (~((~((i1215 & (-1292418225)) | ((-1292418225) ^ i1215))) * 713))) - 1;
                        int iTuitionPaymentFragmentbindingInflater3 = R.style.TuitionPaymentFragmentbindingInflater1();
                        int i1216 = ~iTuitionPaymentFragmentbindingInflater3;
                        int i1217 = ~(((-1668029107) & i1216) | ((-1668029107) ^ i1216));
                        int i1218 = ~iTuitionPaymentFragmentbindingInflater3;
                        int i1219 = (i1217 & 1080564402) | (1080564402 ^ i1217) | (~(((-1080736695) & i1218) | ((-1080736695) ^ i1218)));
                        int i1310 = ~((1668201398 & iTuitionPaymentFragmentbindingInflater3) | (1668201398 ^ iTuitionPaymentFragmentbindingInflater3));
                        int i1311 = 1716859015 - (~(-(-(((i1219 & i1310) | (i1219 ^ i1310)) * (-84)))));
                        int i1312 = ~((iTuitionPaymentFragmentbindingInflater3 & (-1080736695)) | ((-1080736695) ^ iTuitionPaymentFragmentbindingInflater3));
                        int i1313 = (i1312 & 1668029106) | (1668029106 ^ i1312);
                        int i1314 = ~((i1218 & 1080736694) | (i1218 ^ 1080736694));
                        int i1315 = i1311 + (((i1313 & i1314) | (i1313 ^ i1314)) * (-84));
                        int i1316 = ~((i1216 ^ 1080736694) | (i1216 & 1080736694));
                        int i1317 = ((i1316 & (-1668201399)) | (i1316 ^ (-1668201399))) * 84;
                        i17 = ((i1315 | i1317) << 1) - (i1317 ^ i1315);
                        i18 = ~(i & i14);
                        if (i16 > i17) {
                            int i1318 = i18 & (i | i14);
                            int i1319 = -i1318;
                            i19 = (((i1318 & i1319) | (i1318 ^ i1319)) + 71) & 74;
                        } else {
                            int i1410 = i18 & (i | i14);
                            int i1411 = -i1410;
                            i19 = (((i1410 & i1411) | (i1410 ^ i1411)) >> 31) & 16;
                        }
                        ((int[]) objArr2[0])[0] = i;
                        ((int[]) objArr2[2])[0] = i14;
                        objArr2[3] = null;
                        int i1412 = 1397177788 + ((i | (-654491214)) * 140) + (((~((-654491214) | i1119)) | 553686016) * (-280)) + (((~(694801442 | i1119)) | (-795606640) | (~(i | (-553686017)))) * 140);
                        int i1413 = -(-i19);
                        int i1414 = -(-((i1412 & i1413) + (i1413 | i1412)));
                        int i1415 = ((i3 | i1414) << 1) - (i3 ^ i1414);
                        int i1416 = (i1415 << 13) ^ i1415;
                        int i1417 = i1416 >>> 17;
                        int i1418 = ((~i1416) & i1417) | ((~i1417) & i1416);
                        int i1419 = i1418 << 5;
                        ((int[]) objArr2[1])[0] = ((~i1418) & i1419) | ((~i1419) & i1418);
                        return objArr2;
                        if (Build.VERSION.SDK_INT == 30) {
                            i12 = i;
                            r29 = i4;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                Object[] objArr114 = new Object[1];
                                a(new char[]{13272, 58833, 40709, 45405, 27348, 7377, 13835, 59467, 33179, 48003, 27909, 1914, 14520, 54004, 33904, 48766, 22434, 2534, 9012, 54633, 36524, 41193, 23127, 29598, 9690, 57170, 61771, 43653}, 54851 - View.MeasureSpec.getMode(0), objArr114);
                                Object[] objArr115 = {(String) objArr114[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char mirror3 = (char) ('0' - AndroidCharacter.getMirror('0'));
                                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0) + 994;
                                    int i715 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7;
                                    byte b8 = $$a[7];
                                    Object[] objArr116 = new Object[1];
                                    c((short) 141, b8, b8, objArr116);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror3, iIndexOf5, i715, 410748506, false, (String) objArr116[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr115)).longValue();
                                long j19 = 1138337725;
                                r28 = i4;
                                long j110 = -1;
                                long j111 = j19 ^ j110;
                                long j112 = i;
                                long j113 = j112 ^ j110;
                                long j114 = (((long) 55) * j19) + (((long) (-107)) * jLongValue3) + (((long) (-108)) * (((j111 | jLongValue3) ^ j110) | ((j113 | jLongValue3) ^ j110)));
                                long j115 = 54;
                                long j116 = ((jLongValue3 ^ j110) | j19) ^ j110;
                                long j117 = j114 + ((((j111 | j112) ^ j110) | j116 | (j110 ^ (j113 | j19))) * j115) + (j115 * (j112 | j116)) + ((long) (-1339255962));
                                int i716 = (int) (j117 >> 32);
                                int iNextInt3 = new Random().nextInt();
                                int i717 = ~iNextInt3;
                                int i8110 = i716 & (1928006403 + (((~((-566516162) | i717)) | (~((-33619977) | iNextInt3)) | (~((-270574113) | iNextInt3))) * 765) + (((~((-600136138) | i717)) | 566516161) * 1530) + (((~(iNextInt3 | (-600136138))) | (~(i717 | (-270574113)))) * 765));
                                int i8111 = ~i;
                                i5 = i8110 | (((int) j117) & (1168364688 + (((~(1523859847 | i8111)) | (~((-86633438) | i))) * 217) + (((~(1523859847 | i)) | 86616664) * 217) + (((~(i8111 | (-86633438))) | (-1523859848)) * 217)));
                            } else {
                                context = i4;
                                int i8112 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i8113 = (i ^ 60763) | (i & 60763);
                                int i8114 = ~i8112;
                                int i8115 = (((i8112 * (-380)) + 23211466) - (~(((i8113 & i8114) | (i8113 ^ i8114)) * (-381)))) - 1;
                                int i8116 = ~i8112;
                                int i8117 = ~(((-60764) & i8116) | (i8116 ^ (-60764)));
                                int i8118 = ~i;
                                int i8119 = ~((i8118 ^ 60763) | (i8118 & 60763));
                                int i9110 = (i8117 & i8119) | (i8117 ^ i8119);
                                int i9111 = ~(i8112 | 60763);
                                int i9112 = i8115 + (((i9111 & i9110) | (i9110 ^ i9111)) * 381) + ((~(i8116 | 60763)) * 381);
                                Object[] objArr117 = new Object[1];
                                a(new char[]{13254}, i9112, objArr117);
                                str = (String) objArr117[0];
                                int i9113 = -Drawable.resolveOpacity(0, 0);
                                int i9114 = i9113 * (-494);
                                int i9115 = ((((((i9114 | (-29660254)) << 1) - (i9114 ^ (-29660254))) - (~((~(60041 | i9113)) * (-495)))) - 1) - (~(-(-(((~i) | i9113) * 495))))) - 1;
                                int i9116 = ~((~i9113) | (-60042));
                                int i9117 = ~((i9113 & i8118) | (i8118 ^ i9113));
                                int i9118 = -(-(((i9117 & i9116) | (i9116 ^ i9117)) * 495));
                                int i9119 = (i9115 & i9118) + (i9118 | i9115);
                                Object[] objArr118 = new Object[1];
                                a(new char[]{13189, 55569, 59083, 35848, 39350, 42808, 19636, 23087, 26584, 3399, 6863, 8312, 52734}, i9119, objArr118);
                                objArr = new Object[]{(String) objArr118[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cRgb3 = (char) ((-16743614) - Color.rgb(0, 0, 0));
                                    int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                    int iAlpha3 = 26 - Color.alpha(0);
                                    byte b9 = $$a[7];
                                    Object[] objArr119 = new Object[1];
                                    c((short) 141, b9, b9, objArr119);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb3, scrollBarFadeDuration3, iAlpha3, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr))) {
                                    i5 = 0;
                                    r28 = context;
                                } else {
                                    int i10110 = b;
                                    int i10111 = (i10110 ^ 27) + ((i10110 & 27) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10111 % 128;
                                    int i10112 = i10111 % 2;
                                    i13 = (i10110 ^ 17) + ((i10110 & 17) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        int i10113 = 4 / 2;
                                    }
                                    i5 = 1;
                                    r28 = context;
                                }
                            }
                            int i10114 = i ^ 10;
                            i6 = i5 | (-i5);
                            int i10115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i7 = (i10115 & 87) + (i10115 | 87);
                            int i10116 = i7 % 128;
                            b = i10116;
                            if (i7 % 2 == 0) {
                                i8 = i6 + 31;
                            } else {
                                i8 = i6 >> 31;
                            }
                            int i10117 = (~i8) & i;
                            int i10118 = i8 & i10114;
                            int i10119 = (i10118 & i10117) | (i10117 ^ i10118);
                            int i11110 = i2 & 32;
                            int i11111 = (i11110 | (-i11110)) >> 31;
                            int i11112 = (i10116 ^ 21) + ((i10116 & 21) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11112 % 128;
                            i9 = i11112 % 2;
                            i10 = i10119 & (~i11111);
                            i11 = i11111 & i;
                            if (i9 != 0) {
                                i12 = i10 | i11;
                                int i11113 = 18 / 0;
                                r29 = r28;
                            } else {
                                i12 = (i10 & i11) | (i10 ^ i11);
                                r29 = r28;
                            }
                        }
                        int i11114 = (~((i & r29) == true ? 1 : 0)) & ((i | r29) == true ? 1 : 0);
                        int i11115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                        int i11116 = i11115 % 128;
                        b = i11116;
                        int i11117 = i11115 % 2;
                        int i11118 = (i11114 | (-i11114)) >> 31;
                        i14 = (i12 & (~i11118)) | (r29 & i11118);
                        objArr2 = new Object[4];
                        i15 = (i11116 ^ 17) + ((i11116 & 17) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        if (i15 % 2 != 0) {
                            objArr2[1] = new int[1];
                            objArr2[0] = new int[1];
                            objArr2[5] = new int[0];
                        } else {
                            objArr2[0] = new int[1];
                            objArr2[1] = new int[1];
                            objArr2[2] = new int[1];
                        }
                        int i11119 = ~i;
                        int i12110 = ~((-859883314) | i11119);
                        int i12111 = (i12110 & 843072257) | (i12110 ^ 843072257);
                        int i12112 = ~(((-1275607169) & i) | ((-1275607169) ^ i));
                        int i12113 = ((i12111 & i12112) | (i12111 ^ i12112)) * (-713);
                        int i12114 = (((((-1302411990) | i12113) << 1) - (i12113 ^ (-1302411990))) - (~(-(-((~(((-1275607169) & i) | ((-1275607169) ^ i))) * 1426))))) - 1;
                        int i12115 = ~i;
                        i16 = (i12114 - (~((~((i12115 & (-1292418225)) | ((-1292418225) ^ i12115))) * 713))) - 1;
                        int iTuitionPaymentFragmentbindingInflater4 = R.style.TuitionPaymentFragmentbindingInflater1();
                        int i12116 = ~iTuitionPaymentFragmentbindingInflater4;
                        int i12117 = ~(((-1668029107) & i12116) | ((-1668029107) ^ i12116));
                        int i12118 = ~iTuitionPaymentFragmentbindingInflater4;
                        int i12119 = (i12117 & 1080564402) | (1080564402 ^ i12117) | (~(((-1080736695) & i12118) | ((-1080736695) ^ i12118)));
                        int i13110 = ~((1668201398 & iTuitionPaymentFragmentbindingInflater4) | (1668201398 ^ iTuitionPaymentFragmentbindingInflater4));
                        int i13111 = 1716859015 - (~(-(-(((i12119 & i13110) | (i12119 ^ i13110)) * (-84)))));
                        int i13112 = ~((iTuitionPaymentFragmentbindingInflater4 & (-1080736695)) | ((-1080736695) ^ iTuitionPaymentFragmentbindingInflater4));
                        int i13113 = (i13112 & 1668029106) | (1668029106 ^ i13112);
                        int i13114 = ~((i12118 & 1080736694) | (i12118 ^ 1080736694));
                        int i13115 = i13111 + (((i13113 & i13114) | (i13113 ^ i13114)) * (-84));
                        int i13116 = ~((i12116 ^ 1080736694) | (i12116 & 1080736694));
                        int i13117 = ((i13116 & (-1668201399)) | (i13116 ^ (-1668201399))) * 84;
                        i17 = ((i13115 | i13117) << 1) - (i13117 ^ i13115);
                        i18 = ~(i & i14);
                        if (i16 > i17) {
                            int i13118 = i18 & (i | i14);
                            int i13119 = -i13118;
                            i19 = (((i13118 & i13119) | (i13118 ^ i13119)) + 71) & 74;
                        } else {
                            int i14110 = i18 & (i | i14);
                            int i14111 = -i14110;
                            i19 = (((i14110 & i14111) | (i14110 ^ i14111)) >> 31) & 16;
                        }
                        ((int[]) objArr2[0])[0] = i;
                        ((int[]) objArr2[2])[0] = i14;
                        objArr2[3] = null;
                        int i14112 = 1397177788 + ((i | (-654491214)) * 140) + (((~((-654491214) | i11119)) | 553686016) * (-280)) + (((~(694801442 | i11119)) | (-795606640) | (~(i | (-553686017)))) * 140);
                        int i14113 = -(-i19);
                        int i14114 = -(-((i14112 & i14113) + (i14113 | i14112)));
                        int i14115 = ((i3 | i14114) << 1) - (i3 ^ i14114);
                        int i14116 = (i14115 << 13) ^ i14115;
                        int i14117 = i14116 >>> 17;
                        int i14118 = ((~i14116) & i14117) | ((~i14117) & i14116);
                        int i14119 = i14118 << 5;
                        ((int[]) objArr2[1])[0] = ((~i14118) & i14119) | ((~i14119) & i14118);
                        return objArr2;
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                }
            });
            MaterialCardView root = itemListBankBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            MaterialCardView materialCardView = root;
            Function1 function1 = new Function1() { // from class: TrustedWebActivityIntent
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return runExtraCallback.b.b(runextracallback, listBank2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(materialCardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit b(runExtraCallback runextracallback, ListBank listBank, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = runextracallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(listBank);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(runExtraCallback runextracallback, ListBank listBank, View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                Function1 function1 = runextracallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (function1 != null) {
                    function1.invoke(listBank);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }
    }
}
