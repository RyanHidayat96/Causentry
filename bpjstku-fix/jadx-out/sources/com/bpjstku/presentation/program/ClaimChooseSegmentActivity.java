package com.bpjstku.presentation.program;

import android.content.Context;
import android.content.Intent;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda2;
import com.bpjstku.databinding.ActivityClaimChooseSegmentBinding;
import com.bpjstku.di.ApiModuleKt;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.presentation.program.ClaimChooseSegmentActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzpu;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.ViewPortBuilder;
import defpackage.getCaptureRequestOption;
import defpackage.getMaxImages;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\t\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/program/ClaimChooseSegmentActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimChooseSegmentBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "g", "d", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimChooseSegmentActivity extends BindingBaseActivity<ActivityClaimChooseSegmentBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f579a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private List<ClaimSegmenItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 55;
    private static int INotificationSideChannel = 1;
    private static int asBinder = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String asBinder = "";

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i11 | i8 | i2)) | (~(i7 | i11 | i));
        int i13 = i2 + i + i5 + ((-195996979) * i4) + ((-904719387) * i6);
        int i14 = i13 * i13;
        int i15 = (i2 * 1886715248) + 940376064 + (1886715248 * i) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i5) + ((-1389494272) * i4) + (1623064576 * i6) + (1510801408 * i14);
        int i16 = (i2 * 1590984816) + 1398186415 + (i * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i5 * 1590985553) + (i4 * (-1025631779)) + (i6 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = com.bpjstku.presentation.program.ClaimChooseSegmentActivity.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r5]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ClaimChooseSegmentActivity.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.ClaimChooseSegmentActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/program/ClaimChooseSegmentActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "p1", "", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, List<ClaimSegmenItem> p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intent intent = new Intent(p0, (Class<?>) ClaimChooseSegmentActivity.class);
            Intrinsics.checkNotNull(p1, "");
            intent.putParcelableArrayListExtra("claimSegmen", (ArrayList) p1);
            intent.putExtra("claimType", p2);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimChooseSegmentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ClaimChooseSegmentActivity$bindingInflater$1 claimChooseSegmentActivity$bindingInflater$1 = ClaimChooseSegmentActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            return claimChooseSegmentActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: AutoValue_Camera2CameraImpl_UseCaseInfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClaimChooseSegmentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        ImageView imageView = ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Function1 function1 = new Function1() { // from class: getCaptureTypes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) ClaimChooseSegmentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2057629607, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj}, -2057629607, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        };
        Intrinsics.checkNotNullParameter(imageView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgNonSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        ImageView imageView4 = imageView3;
        Function1 function2 = new Function1() { // from class: getSessionConfig
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimChooseSegmentActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        imageView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        ImageView imageView5 = ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgIndonesianMigrantWorker;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        ImageView imageView6 = imageView5;
        Function1 function3 = new Function1() { // from class: AutoValue_CameraDeviceId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimChooseSegmentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView6, "");
        Intrinsics.checkNotNullParameter(function3, "");
        imageView6.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function3));
        int i2 = cancelAll + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getIntent().getParcelableArrayListExtra("claimSegmen");
            getIntent().getStringExtra("claimType");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getIntent().getParcelableArrayListExtra("claimSegmen");
        String stringExtra = getIntent().getStringExtra("claimType");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra;
        int i3 = cancelAll + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[SYNTHETIC] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        ClaimSegmenItem claimSegmenItem;
        String str;
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        List<ClaimSegmenItem> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list != null) {
            Iterator<T> it = list.iterator();
            int i3 = asBinder + 81;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                int i5 = asBinder + 23;
                cancelAll = i5 % 128;
                if (i5 % 2 == 0) {
                    claimSegmenItem = (ClaimSegmenItem) it.next();
                    str = claimSegmenItem.b;
                    iHashCode = str.hashCode();
                    if (iHashCode != 7136) {
                        if (iHashCode != 65991) {
                            if (iHashCode == 79340) {
                                i = asBinder + 47;
                                cancelAll = i % 128;
                                if (i % 2 != 0) {
                                    str.equals("PMI");
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (str.equals("PMI")) {
                                    ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(0);
                                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = claimSegmenItem.b;
                                }
                            }
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(8);
                        } else if (str.equals("BPU")) {
                            int i6 = asBinder + 31;
                            cancelAll = i6 % 128;
                            int i7 = i6 % 2;
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(0);
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = claimSegmenItem.b;
                        } else {
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(8);
                        }
                    } else if (str.equals("PU")) {
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(0);
                        this.b = claimSegmenItem.b;
                    } else {
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(8);
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(8);
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(8);
                    }
                } else {
                    claimSegmenItem = (ClaimSegmenItem) it.next();
                    str = claimSegmenItem.b;
                    iHashCode = str.hashCode();
                    if (iHashCode != 2565) {
                        if (iHashCode != 65991) {
                            if (iHashCode == 79340) {
                                i = asBinder + 47;
                                cancelAll = i % 128;
                                if (i % 2 != 0) {
                                    str.equals("PMI");
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (str.equals("PMI")) {
                                    ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(0);
                                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = claimSegmenItem.b;
                                }
                            }
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(8);
                        } else if (str.equals("BPU")) {
                            int i8 = asBinder + 31;
                            cancelAll = i8 % 128;
                            int i9 = i8 % 2;
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(0);
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = claimSegmenItem.b;
                        } else {
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(8);
                            ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(8);
                        }
                    } else if (str.equals("PU")) {
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(8);
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupNonSalariedWorker.setVisibility(8);
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(8);
                    } else {
                        ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker.setVisibility(0);
                        this.b = claimSegmenItem.b;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0195  */
    /* JADX WARN: Code duplicated, block: B:49:0x0196  */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.combineMeasuredStates(0, 0) + 2624, 13 - KeyEvent.normalizeMetaState(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (f579a ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 39423), (ViewConfiguration.getPressedStateDuration() >> 16) + 481, 37 - KeyEvent.keyCodeFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            } catch (Throwable th2) {
                Throwable cause3 = th2.getCause();
                if (cause3 == null) {
                    throw th2;
                }
                throw cause3;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $11 + 61;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 % 4;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 39422), TextUtils.getTrimmedLength("") + 481, View.resolveSizeAndState(0, 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 480, ((Process.getThreadPriority(0) + 20) >> 6) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } catch (Throwable th3) {
                cause = th3.getCause();
                if (cause != null) {
                    throw th3;
                }
                throw cause;
            }
            cause = th3.getCause();
            if (cause != null) {
                throw th3;
            }
            throw cause;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        if (!(!Intrinsics.areEqual(str, ProgramType.JKK.getCode()))) {
            int i2 = asBinder + 35;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            MaterialToolbar materialToolbar = ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
            String string = getString(R.string.label_title_claim_jkk);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
            this.asBinder = getString(R.string.label_title_claim_jkk);
            return;
        }
        if (Intrinsics.areEqual(str, ProgramType.JKM.getCode())) {
            int i4 = cancelAll + 115;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            MaterialToolbar materialToolbar2 = ((ActivityClaimChooseSegmentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
            String string2 = getString(R.string.label_title_claim_jkm);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar2, string2, true);
            this.asBinder = getString(R.string.label_title_claim_jkm);
            int i6 = asBinder + 81;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final String b(String p0) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(p0, "PMI")) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            String strConnect = getMaxImages.connect();
            this.asInterface = strConnect;
            String lowerCase = this.TuitionPaymentFragmentbindingInflater1.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String upperCase = p0.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            String str = (String) TuitionPaymentFragmentspecialinlinedviewModeldefault3(380642245, new Object[]{upperCase}, -380642244, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            StringBuilder sb = new StringBuilder();
            sb.append(strConnect);
            sb.append("/");
            sb.append(lowerCase);
            sb.append("/");
            sb.append(str);
            return sb.toString();
        }
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        String strMediaBrowserCompat = getMaxImages.MediaBrowserCompat();
        this.asInterface = strMediaBrowserCompat;
        String lowerCase2 = this.TuitionPaymentFragmentbindingInflater1.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        String lowerCase3 = p0.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        String upperCase2 = p0.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        String str2 = (String) TuitionPaymentFragmentspecialinlinedviewModeldefault3(380642245, new Object[]{upperCase2}, -380642244, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strMediaBrowserCompat);
        sb2.append("/");
        sb2.append(lowerCase2);
        sb2.append("/");
        sb2.append(lowerCase3);
        sb2.append("/");
        sb2.append(str2);
        String string = sb2.toString();
        int i4 = asBinder + 99;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 1;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(str, "PMI");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(str, "PMI")) {
            getCaptureRequestOption.Companion companion = getCaptureRequestOption.INSTANCE;
            return getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE.TuitionPaymentFragmentbindingInflater1("{\"source\":\"jmo\"}", ApiModuleKt.getClaimPmiSaltKey(), "PMI"));
        }
        getCaptureRequestOption.Companion companion2 = getCaptureRequestOption.INSTANCE;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE, "{\"source\":\"jmo\"}", ApiModuleKt.getAppSignature()));
        int i3 = asBinder + 53;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr2;
        ClaimChooseSegmentActivity claimChooseSegmentActivity = (ClaimChooseSegmentActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 41;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
            int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
            byte[] bArr = $$a;
            short s = bArr[28];
            Object[] objArr3 = new Object[1];
            c(s, (byte) (s & 15), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetAfter, i4, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int windowTouchSlop = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                short s2 = (short) ($$b & 236);
                byte b = $$a[7];
                Object[] objArr4 = new Object[1];
                c(s2, b, b, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, scrollBarFadeDuration, windowTouchSlop, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i5 = (-118798613) + (((~((~iFreeMemory) | 598814977)) | 273419834) * 446) + (((~(iFreeMemory | 872234811)) | 537997569) * 446) + 1156453508;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
            int i8 = asBinder + 111;
            cancelAll = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{26595, 65385, 22269, 44651, 1443, 40288, 62702, 19552, 41958, 15150, 37584, 60027, 16886, 55664, 12514, 34923}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 39030, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{26592, 36022, 45402, 42486, 51857, 65319, 58335, 2189, 15641, 8667, 22132, 31496, 28558, 38009, 47383, 44473}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik).substring(0, 11).codePointAt(8) + 60171, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, claimChooseSegmentActivity)).intValue();
            try {
                Object[] objArr8 = {-2131422943};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42049), Color.argb(0, 0, 0, 0) + 1726, 29 - Gravity.getAbsoluteGravity(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), -529708168, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                    int i10 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iRed = Color.red(0) + 23;
                    short s3 = (short) ($$b & 236);
                    byte b2 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c(s3, b2, b2, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i10, iRed, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{26600, 18210, 9831, 1460, 58610, 50233, 41843, 33476, 25038, 16663, 8213, 4013, 61132, 52731, 44347, 35943, 27572, 19167, 10815, 2425, 59534, 55243}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8388, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{26604, 5482, 33526, 12372, 44486, 23335, 51383, 17970, 62356, 24815, 7795, 35800, 14676, 46759, 9278}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step4).substring(0, 1).length() + 29326, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int i11 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                        byte b3 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((short) 88, b3, b3, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, i11, capsMode, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop2 = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iIndexOf = 1755 - TextUtils.indexOf("", "");
                        int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr2 = $$a;
                        short s4 = bArr2[28];
                        Object[] objArr13 = new Object[1];
                        c(s4, (byte) (s4 & 15), bArr2[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop2, iIndexOf, threadPriority, 986134021, false, (String) objArr13[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i13 == i12) {
            int i14 = cancelAll + 89;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iMyTid = Process.myTid();
            int i17 = ~iMyTid;
            int i18 = i16 + (-144688828) + (((~((-298003662) | i17)) | (~(85401235 | i17))) * (-867)) + (((~((-298003662) | iMyTid)) | 281026636 | (~(85401235 | iMyTid))) * (-1734)) + (((~(iMyTid | 366427871)) | (~(i17 | (-281026637))) | (~((-16977026) | iMyTid))) * 867);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr14[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                int i21 = asBinder + 61;
                cancelAll = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i23 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iMyUid = Process.myUid();
            int i24 = i23 + 1168920854 + ((~((-5518347) | iMyUid)) * (-301)) + (((~(284507562 | iMyUid)) | (~((~iMyUid) | 497109988))) * (-301)) + (((~(iMyUid | (-497109989))) | 284507562) * 301);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr15[3])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int i27 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
            byte b4 = $$a[7];
            Object[] objArr16 = new Object[1];
            c((short) 140, b4, b4, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, i27, iLastIndexOf, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new char[]{26600, 18210, 9831, 1460, 58610, 50233, 41843, 33476, 25038, 16663, 8213, 4013, 61132, 52731, 44347, 35943, 27572, 19167, 10815, 2425, 59534, 55243}, 8437 - AndroidCharacter.getMirror('0'), objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new char[]{26604, 5482, 33526, 12372, 44486, 23335, 51383, 17970, 62356, 24815, 7795, 35800, 14676, 46759, 9278}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).length() + 29325, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
            short s5 = (short) ($$b & 236);
            byte b5 = $$a[7];
            Object[] objArr19 = new Object[1];
            c(s5, b5, b5, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout, iCombineMeasuredStates, absoluteGravity, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i28 = asBinder + 49;
            cancelAll = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                int iCombineMeasuredStates2 = 15 - View.combineMeasuredStates(0, 0);
                Object[] objArr20 = new Object[1];
                c((short) DerHeader.TAG_CLASS_PRIVATE, (byte) ($$b - 3), $$a[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, minimumFlingVelocity, iCombineMeasuredStates2, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr21[3])[0];
            int i31 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iMyTid2 = Process.myTid();
            int i32 = ~iMyTid2;
            int i33 = (((189349314 + (((-11575339) | i32) * (-369))) + (((~((-1062161366) | i32)) | (-817881196)) * (-369))) + ((((~(iMyTid2 | 1062161365)) | (-1073736704)) | (~(i32 | (-806305858)))) * 369)) - 1600574010;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{26595, 65385, 22269, 44651, 1443, 40288, 62702, 19552, 41958, 15150, 37584, 60027, 16886, 55664, 12514, 34923}, 39041 - KeyEvent.normalizeMetaState(0), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{26592, 36022, 45402, 42486, 51857, 65319, 58335, 2189, 15641, 8667, 22132, 31496, 28558, 38009, 47383, 44473}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60215, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, claimChooseSegmentActivity)).intValue();
            Object[] objArr24 = {-2131422943};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 46038), (Process.myTid() >> 22) + 1134, Process.getGidForName("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -1600574010, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                byte b6 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 140, b6, b6, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cKeyCodeFromString, iLastIndexOf2, maximumDrawingCacheSize, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), MotionEvent.axisFromString("") + 1118, TextUtils.getOffsetAfter("", 0) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                Object[] objArr27 = new Object[1];
                c((short) DerHeader.TAG_CLASS_PRIVATE, (byte) ($$b - 3), $$a[5], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarSize, scrollBarFadeDuration2, deadChar, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{26600, 18210, 9831, 1460, 58610, 50233, 41843, 33476, 25038, 16663, 8213, 4013, 61132, 52731, 44347, 35943, 27572, 19167, 10815, 2425, 59534, 55243}, 8389 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{26604, 5482, 33526, 12372, 44486, 23335, 51383, 17970, 62356, 24815, 7795, 35800, 14676, 46759, 9278}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step4).substring(0, 1).codePointAt(0) + 29260, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int capsMode2 = 1031 - TextUtils.getCapsMode("", 0, 0);
                    int iResolveSizeAndState = 15 + View.resolveSizeAndState(0, 0, 0);
                    short s6 = (short) ($$b & 236);
                    byte b7 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(s6, b7, b7, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay, capsMode2, iResolveSizeAndState, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iMyTid3 = (Process.myTid() >> 22) + 1031;
                    int iAxisFromString = 14 - MotionEvent.axisFromString("");
                    byte b8 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c((short) 140, b8, b8, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cBlue, iMyTid3, iAxisFromString, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr2[1])[0];
        int i37 = ((int[]) objArr2[3])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr2[2])[0];
        int i39 = ((int[]) objArr2[3])[0];
        int i40 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i41 = ~startUptimeMillis;
        int i42 = i38 + 189349314 + (((-135408139) | i41) * (-369)) + (((~((-934139382) | i41)) | (-689859212)) * (-369)) + (((~(startUptimeMillis | 934139381)) | (-1069547520) | (~(i41 | (-554451074)))) * 369);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr32[2])[0] = i44 ^ (i44 << 5);
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimChooseSegmentActivity claimChooseSegmentActivity, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                claimChooseSegmentActivity.finish();
                ViewPortBuilder.b();
            } else {
                claimChooseSegmentActivity.finish();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ClaimChooseSegmentActivity claimChooseSegmentActivity, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        String upperCase = claimChooseSegmentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseSegmentActivity, claimChooseSegmentActivity.b(upperCase), claimChooseSegmentActivity.asBinder, 0, null, false, 56);
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimChooseSegmentActivity claimChooseSegmentActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        String upperCase = claimChooseSegmentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseSegmentActivity, claimChooseSegmentActivity.b(upperCase), claimChooseSegmentActivity.asBinder, 0, null, false, 56);
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ClaimChooseSegmentActivity claimChooseSegmentActivity = (ClaimChooseSegmentActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 97;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        String upperCase = claimChooseSegmentActivity.b.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseSegmentActivity, claimChooseSegmentActivity.b(upperCase), claimChooseSegmentActivity.asBinder, 0, null, false, 56);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 121;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(ClaimChooseSegmentActivity claimChooseSegmentActivity, View view) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(2057629607, new Object[]{claimChooseSegmentActivity, view}, -2057629607, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static {
        onTransact = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 65;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault3(380642245, new Object[]{p0}, -380642244, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_claim_choose_segment;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancelAll + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = asBinder + 45;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = cancelAll + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = cancelAll + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int i = 2 % 2;
        int i2 = cancelAll + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asBinder + 3;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = cancelAll + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1219251562, new Object[]{this, context}, 1219251564, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ComplaintDataStore$$ExternalSyntheticLambda2.b());
    }

    static void g() {
        f579a = -704409720972915054L;
    }
}
