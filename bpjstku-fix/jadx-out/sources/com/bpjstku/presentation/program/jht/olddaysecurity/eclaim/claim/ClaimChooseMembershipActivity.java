package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityClaimChooseMembershipBinding;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzbrl;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.setSurfaceOccupancyPriority;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimChooseMembershipActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimChooseMembershipBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimChooseMembershipActivity extends BindingBaseActivity<ActivityClaimChooseMembershipBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f585a;
    private static int asBinder;
    private static int asInterface;
    private static int cancelAll;
    private static byte[] d;
    private static int g;
    private List<ClaimSegmenItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {97, 58, 103, -72};
    private static final int $$f = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {31, -3, -46, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 104;
    private static int INotificationSideChannel = 0;
    private static int cancel = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i4);
        int i8 = ~((~i6) | i4);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i4) | i)) | i7;
        int i11 = i4 + i + i5 + ((-1814252664) * i3) + (2073254503 * i2);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i4) + 1943797760 + (1745420935 * i) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i5) + ((-1631584256) * i3) + ((-1368915968) * i2) + ((-1053032448) * i12);
        int i14 = (i4 * (-1919122223)) + 1408767311 + (i * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i5 * (-1919121629)) + (i3 * (-390511720)) + (i2 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        if (i15 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 != 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        ClaimChooseMembershipActivity claimChooseMembershipActivity = (ClaimChooseMembershipActivity) objArr[0];
        int i16 = 2 % 2;
        ActivityClaimChooseMembershipBinding activityClaimChooseMembershipBinding = (ActivityClaimChooseMembershipBinding) ((ViewBinding) claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        List<ClaimSegmenItem> list = claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list != null) {
            for (ClaimSegmenItem claimSegmenItem : list) {
                int i17 = cancel + 19;
                notify = i17 % 128;
                int i18 = i17 % 2;
                String str = claimSegmenItem.b;
                int iHashCode = str.hashCode();
                if (iHashCode != 2565) {
                    if (iHashCode != 65991) {
                        if (iHashCode == 79340 && str.equals("PMI")) {
                            activityClaimChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(0);
                            claimChooseMembershipActivity.TuitionPaymentFragmentbindingInflater1 = claimSegmenItem.b;
                        } else {
                            activityClaimChooseMembershipBinding.groupSalariedWorker.setVisibility(8);
                            activityClaimChooseMembershipBinding.groupNonSalariedWorker.setVisibility(8);
                            activityClaimChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(8);
                        }
                    } else if (!str.equals("BPU")) {
                        activityClaimChooseMembershipBinding.groupSalariedWorker.setVisibility(8);
                        activityClaimChooseMembershipBinding.groupNonSalariedWorker.setVisibility(8);
                        activityClaimChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(8);
                    } else {
                        activityClaimChooseMembershipBinding.groupNonSalariedWorker.setVisibility(0);
                        claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = claimSegmenItem.b;
                        int i19 = cancel + 25;
                        notify = i19 % 128;
                        int i20 = i19 % 2;
                    }
                } else if (str.equals("PU")) {
                    activityClaimChooseMembershipBinding.groupSalariedWorker.setVisibility(0);
                    claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = claimSegmenItem.b;
                } else {
                    activityClaimChooseMembershipBinding.groupSalariedWorker.setVisibility(8);
                    activityClaimChooseMembershipBinding.groupNonSalariedWorker.setVisibility(8);
                    activityClaimChooseMembershipBinding.groupIndonesianMigrantWorker.setVisibility(8);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r7 = 144 - r7
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimChooseMembershipActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "p1", "", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, List<ClaimSegmenItem> p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intent intent = new Intent(p0, (Class<?>) ClaimChooseMembershipActivity.class);
            Intrinsics.checkNotNull(p1, "");
            intent.putParcelableArrayListExtra("claimSegmen", (ArrayList) p1);
            intent.putExtra("codePengajuan", p2);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimChooseMembershipBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 89;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ClaimChooseMembershipActivity$bindingInflater$1 claimChooseMembershipActivity$bindingInflater$1 = ClaimChooseMembershipActivity$bindingInflater$1.b;
            throw null;
        }
        ClaimChooseMembershipActivity$bindingInflater$1 claimChooseMembershipActivity$bindingInflater$2 = ClaimChooseMembershipActivity$bindingInflater$1.b;
        int i3 = cancel + 21;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            return claimChooseMembershipActivity$bindingInflater$2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityClaimChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lambdaisUseCaseAttached11androidxcameracamera2internalCamera2CameraImpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClaimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        ImageView imageView = ((ActivityClaimChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Function1 function1 = new Function1() { // from class: lambdarelease5androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) ClaimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-836717432, objArr, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 836717433, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        };
        Intrinsics.checkNotNullParameter(imageView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = ((ActivityClaimChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgNonSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        ImageView imageView4 = imageView3;
        Function1 function2 = new Function1() { // from class: lambdarelease4androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        imageView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        ImageView imageView5 = ((ActivityClaimChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgIndonesianMigrantWorker;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        ImageView imageView6 = imageView5;
        Function1 function3 = new Function1() { // from class: lambdaonUseCaseUpdated9androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimChooseMembershipActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView6, "");
        Intrinsics.checkNotNullParameter(function3, "");
        imageView6.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function3));
        int i2 = cancel + 5;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ClaimChooseMembershipActivity claimChooseMembershipActivity = (ClaimChooseMembershipActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 103;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = claimChooseMembershipActivity.getIntent().getParcelableArrayListExtra("claimSegmen");
        int i4 = notify + 41;
        cancel = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        MaterialToolbar materialToolbar;
        String string;
        boolean z;
        int i = 2 % 2;
        int i2 = notify + 9;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            materialToolbar = ((ActivityClaimChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
            string = getString(R.string.title_claim_old_day_security);
            Intrinsics.checkNotNullExpressionValue(string, "");
            z = false;
        } else {
            materialToolbar = ((ActivityClaimChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
            string = getString(R.string.title_claim_old_day_security);
            Intrinsics.checkNotNullExpressionValue(string, "");
            z = true;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, z);
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(g)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int modifierMetaStateMask = 2266 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iMyTid = (Process.myTid() >> 22) + 33;
                byte length2 = (byte) $$c.length;
                byte b2 = (byte) (length2 - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, modifierMetaStateMask, iMyTid, 1387473586, false, $$i(length2, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr2 = d;
                long j2 = 0;
                if (bArr2 != null) {
                    int length3 = bArr2.length;
                    byte[] bArr3 = new byte[length3];
                    int i8 = 0;
                    while (i8 < length3) {
                        int i9 = $10 + 45;
                        $11 = i9 % 128;
                        if (i9 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3358, 17 - Process.getGidForName(""), -1054011043, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr3[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3357, 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1054011043, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr3[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                        }
                        i8++;
                        i6 = 2;
                        j2 = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i10 = $10 + 77;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr4 = d;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i11 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i12 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                byte length4 = (byte) $$c.length;
                                byte b7 = (byte) (length4 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i11, i12, 1387473586, false, $$i(length4, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) - 3046761265686732006L)) >>> ((int) (((long) g) % 3046761265686732006L));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr5 = d;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int iAlpha = Color.alpha(0) + 2267;
                            int iResolveOpacity = 33 - Drawable.resolveOpacity(0, 0);
                            byte length5 = (byte) $$c.length;
                            byte b8 = (byte) (length5 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, iAlpha, iResolveOpacity, 1387473586, false, $$i(length5, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr5[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) f585a[i3 + ((int) (((long) asBinder) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i13 = ((i3 + iIntValue) - 2) + ((int) (((long) asBinder) ^ j));
                if (z) {
                    int i14 = $11 + 63;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 + i4;
                Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b9 = (byte) 3;
                    byte b10 = (byte) (b9 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (55904 - (ViewConfiguration.getTapTimeout() >> 16)), 2855 - (KeyEvent.getMaxKeyCode() >> 16), 13 - View.getDefaultSize(0, 0), -1529949196, false, $$i(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr6 = d;
                if (bArr6 != null) {
                    int i16 = $11 + 15;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i17 = 0; i17 < length; i17++) {
                        bArr[i17] = (byte) (((long) bArr6[i17]) ^ 3046761265686732006L);
                    }
                    bArr6 = bArr;
                }
                boolean z2 = bArr6 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        int i18 = $10 + 59;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        byte[] bArr7 = d;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                        int i21 = $10 + 23;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                    } else {
                        short[] sArr = f585a;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i23]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int i2 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iIndexOf = 15 - TextUtils.indexOf("", "");
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), (byte) ($$b >>> 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, i2, iIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).length() + 1610738223, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 107, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step3).substring(14, 15).codePointAt(0) - 151), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 78), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 742384908, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_card_number).substring(11, 12).length() + 1610738227, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 107, (short) (KeyEvent.keyCodeFromString("") - 107), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_all_bank).substring(13, 15).codePointAt(1) - 118), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 742384991, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
            int iRgb = (-16777201) - Color.rgb(0, 0, 0);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 89), (byte) ($$b >>> 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, trimmedLength, iRgb, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                byte[] bArr = $$a;
                byte b3 = bArr[5];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 36), bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, keyRepeatTimeout2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((((-2140082559) + (((~((-165995286) | i5)) | 10518548) * 168)) + ((~((-10518549) | iIdentityHashCode)) * 168)) + (((~(iIdentityHashCode | (-155476738))) | ((~(i5 | (-78284885))) | 67766336)) * 168)) - 126285060;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(1610738233 - Color.blue(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_userid_invalid).substring(13, 15).length() - 73, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 112), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 742384896, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).codePointAt(8) + 1610738135, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.company_code).substring(1, 2).length() - 72, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 75), (byte) (AndroidCharacter.getMirror('0') + '('), (Process.myTid() >> 22) - 742384844, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {230699918};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46086 - AndroidCharacter.getMirror('0')), 1134 - (Process.myPid() >> 22), 18 - View.resolveSizeAndState(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -126285060, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, (short) (b4 | 141), (byte) ($$b >>> 1), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, pressedStateDuration, keyRepeatDelay, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0')), 1118 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[5];
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 36), bArr2[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, defaultSize, packedPositionType, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1610738188, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 107, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 90), (byte) (View.resolveSizeAndState(0, 0, 0) + 89), (-742384898) - TextUtils.indexOf((CharSequence) "", '0'), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(1610738228 - TextUtils.getTrimmedLength(""), (-71) - View.getDefaultSize(0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_giftcard_number).substring(1, 2).codePointAt(0) - 218), (byte) (Color.argb(0, 0, 0, 0) - 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_detection_timeout_error).substring(0, 19).length() - 742384894, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b6 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 89), (byte) ($$b >>> 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild, fadingEdgeLength, maximumDrawingCacheSize, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1031;
                        int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b7 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(b7, (short) (b7 | 141), (byte) ($$b >>> 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, packedPositionType2, modifierMetaStateMask, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i9 = cancel + 105;
        notify = i9 % 128;
        int i10 = i9 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i14 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_utilized_orderid).substring(9, 10).length() - 764627183);
        int i15 = i11 + (((644797189 + (((~(193948519 | i14)) | 50331650) * (-828))) + ((i14 | 193948519) * (-828))) - 1675584608);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr18[2])[0] = i17 ^ (i17 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cGreen = (char) (Color.green(0) + 29944);
            int i18 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
            byte b8 = $$a[7];
            short s = (short) (b8 | 37);
            Object[] objArr19 = new Object[1];
            c(b8, s, (byte) s, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cGreen, i18, maximumFlingVelocity, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int i19 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                byte b9 = $$a[7];
                Object[] objArr20 = new Object[1];
                c(b9, (short) (b9 | 89), (byte) ($$b >>> 1), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, i19, maxKeyCode, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_mandiri).substring(15, 17).codePointAt(0) + 718925658;
            int i20 = ((((-1197986261) + (((~((~iCodePointAt) | (-524817))) | (~((-139719115) | iCodePointAt))) * (-302))) + ((~((-524817) | iCodePointAt)) * (-604))) + (((~(iCodePointAt | (-140243931))) | (-492565471)) * 302)) - 189129546;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i22 ^ (i22 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto2).substring(8, 9).length() + 1610738232, (-71) - Color.alpha(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_6).substring(17, 19).length() - 78), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 742384871, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(TextUtils.indexOf("", "", 0) + 1610738232, View.combineMeasuredStates(0, 0) - 71, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 176), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 18), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 742384943, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {230699918};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42049), 1726 - View.MeasureSpec.getSize(0), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -189129546, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                int i23 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                byte b10 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b10, (short) (b10 | 89), (byte) ($$b >>> 1), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize2, i23, tapTimeout, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart).substring(0, 8).length() + 1610738216, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 107, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 65), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 78), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).codePointAt(0) - 742385014, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_4).substring(51, 53).codePointAt(0) + 1610738131, (-71) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (Process.getGidForName("") - 106), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 44), ((Process.getThreadPriority(0) + 20) >> 6) - 742384875, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRed = (char) (Color.red(0) + 29944);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1756;
                    int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b11 = $$a[7];
                    short s2 = b11;
                    Object[] objArr28 = new Object[1];
                    c(b11, s2, (byte) (s2 | 52), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, packedPositionChild2, iMakeMeasureSpec, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                    int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                    byte b12 = $$a[7];
                    short s3 = (short) (b12 | 37);
                    Object[] objArr29 = new Object[1];
                    c(b12, s3, (byte) s3, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyTid, maximumDrawingCacheSize3, iResolveOpacity, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i24 = notify + 3;
                cancel = i24 % 128;
                int i25 = i24 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i27 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i27 == i26) {
            int i28 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i30 = ~i29;
            int i31 = i28 + 564329230 + (((~(i30 | (-693675162))) | 906277587) * (-1042)) + (((-693675162) | i29) * 521) + (((~(i29 | (-906277588))) | 369365570 | (~(i30 | (-156763145)))) * 521);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr30[3])[0] = i33 ^ (i33 << 5);
            int i34 = cancel + 15;
            notify = i34 % 128;
            int i35 = i34 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
        if (strArr4 != null) {
            int i36 = notify + 103;
            cancel = i36 % 128;
            int i37 = 2;
            int i38 = i36 % 2;
            int i39 = 0;
            while (i39 < strArr4.length) {
                int i40 = notify + 101;
                cancel = i40 % 128;
                if (i40 % i37 != 0) {
                    arrayList2.add(strArr4[i39]);
                    i39 += 56;
                } else {
                    arrayList2.add(strArr4[i39]);
                    i39++;
                }
                i37 = 2;
            }
        }
        int[] iArr = new int[i27];
        int i41 = i27 - 1;
        iArr[i41] = 1;
        Toast.makeText((Context) null, iArr[((i27 * i41) % 2) - 1], 1).show();
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iMyUid = Process.myUid();
        int i43 = ~iMyUid;
        int i44 = (~((-193656477) | i43)) | 16783004;
        int i45 = ~(iMyUid | 195819421);
        int i46 = i42 + ((i44 | i45) * (-252)) + 146952137 + ((i45 | (~(i43 | (-176873473)))) * 252);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[3])[0] = i48 ^ (i48 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 79;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i6 = ~i5;
        if (i4 != (-2129560248) + ((~(932178633 | i6)) * (-560)) + ((~(i5 | 2140139497)) * (-560)) + (((~((-1762166177) | i6)) | 554205312) * 560)) {
            throw null;
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i9 = ~i8;
        if (i7 != ((((~(i9 | 2104647540)) | ((~((-474408425) | i9)) | 303240)) * (-397)) - 501164968) + ((i8 | 1630845596) * 397)) {
            throw new RuntimeException("-1339005238");
        }
        super.onResume();
        int i10 = notify + 41;
        cancel = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 31;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_deeplink).substring(1, 2).length() - 105147196;
            int i4 = ~length;
            if (i3 != 135790146 + (((~(1582478392 | i4)) | (~((-1375773721) | length))) * (-831)) + ((~(2128264569 | length)) * (-1662)) + (((~(length | (-1582478393))) | (~(i4 | (-752490850))) | (~(752490849 | length))) * 831)) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            if (i5 != (-1465205680) + (((~(i6 | (-1197535584))) | 367548040) * (-1042)) + (((-1197535584) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-367548041))) | 277350016 | (~(i6 | (-1107337560)))) * 521)) {
                throw null;
            }
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = (int) Runtime.getRuntime().totalMemory();
        if (i7 != (((~(i8 | 98578499)) | (-1814489831)) * 56) + 934659420 + (((~((~i8) | (-1814489831))) | 98578499) * 56)) {
            throw new RuntimeException("170600019");
        }
        super.onStart();
        int i9 = notify + 15;
        cancel = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 49;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            if (i3 != (((~((-201326609) | i4)) * 521) - 1336236446) + (((~((~i4) | (-201326609))) | (-1593540090)) * 521)) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step5).substring(0, 3).length() + 1733517046;
            if (i5 != (-716623978) + (((~((-17335626) | length)) | (~((-847323169) | length))) * 69) + (((~(length | (-851536567))) | (~((-21549024) | length)) | 4213398) * (-69)) + 177360896) {
                throw null;
            }
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~System.identityHashCode(this);
        if (i6 != (-1503703225) + ((~((-159420933) | i7)) * (-783)) + (((~(i7 | 1882155512)) | (-696900453)) * 783)) {
            throw new RuntimeException("1200719561");
        }
        super.onCreate(bundle);
        int i8 = notify + 85;
        cancel = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Unit b(ClaimChooseMembershipActivity claimChooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = notify + 1;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
            ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseMembershipActivity, claimChooseMembershipActivity.TuitionPaymentFragmentbindingInflater1, "");
            return Unit.INSTANCE;
        }
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseMembershipActivity, claimChooseMembershipActivity.TuitionPaymentFragmentbindingInflater1, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ClaimChooseMembershipActivity claimChooseMembershipActivity = (ClaimChooseMembershipActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = notify + 105;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
            ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseMembershipActivity, claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseMembershipActivity, claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Unit unit2 = Unit.INSTANCE;
        int i4 = cancel + 53;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimChooseMembershipActivity claimChooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 19;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            claimChooseMembershipActivity.finish();
            ViewPortBuilder.b();
            int i4 = notify + 101;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimChooseMembershipActivity claimChooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimChooseMembershipActivity, claimChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 71;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimChooseMembershipActivity claimChooseMembershipActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-836717432, new Object[]{claimChooseMembershipActivity, view}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 836717433, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static {
        cancelAll = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 15;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 69;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_claim_choose_membership;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(521643804, new Object[]{this}, 340815196 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -521643804, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = notify + 39;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(154093212, new Object[]{this}, zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1982423309, -154093210, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 13;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 17;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        asBinder = -1600996889;
        g = -1934795616;
        asInterface = 324225751;
        d = new byte[]{54, 97, 5, 118, 64, 35, 97, 56, 104, 63, 83, 84, -2, 117, -88, 47, 62, 63, 60, 107, 3, 108, 47, -115, -127, -98, -67, -72, -119, -80, 103, -108, -109, ByteCompanionObject.MIN_VALUE, -124, -98, -116, 44, 115, 26, 106, -31, 85, 86, 52, -30, 126, -26, 45, 62, 16, 70, -28, 44, ByteCompanionObject.MAX_VALUE, 11, 82, 37, 11, 108, 103, 49, 123, 117, 11, 120, 119, ByteCompanionObject.MAX_VALUE, 5};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity.$$c
            int r6 = 121 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2b:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity.$$i(int, byte, short):java.lang.String");
    }
}
