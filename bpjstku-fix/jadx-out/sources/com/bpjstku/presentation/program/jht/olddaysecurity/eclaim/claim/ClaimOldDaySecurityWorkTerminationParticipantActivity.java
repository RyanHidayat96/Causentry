package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityClaimOldDaySecurityWorkTerminationParticipantBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.libraries.places.api.net.kotlin.zzo;
import com.google.android.libraries.places.internal.zzpu;
import com.google.android.libraries.places.widget.zzw;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0018\u0010\u001e\u001a\u0006*\u00020\u001c0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0018\u0010\u0018\u001a\u0006*\u00020\u001c0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\b\u001a\u00020\u001f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010 "}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityWorkTerminationParticipantActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityClaimOldDaySecurityWorkTerminationParticipantBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimOldDaySecurityWorkTerminationParticipantActivity extends BindingReactiveFormActivity<ActivityClaimOldDaySecurityWorkTerminationParticipantBinding> {
    private static int[] asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private IndividualDataClaim a;
    private static final byte[] $$c = {14, 70, 6, -35};
    private static final int $$f = 145;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 109;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f589a = 0;
    private static int d = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final SimpleDateFormat b = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Calendar.getInstance();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentbindingInflater1 = Calendar.getInstance();

    /* JADX WARN: Code duplicated, block: B:17:0x01d8  */
    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i8 | i3)) | i7;
        int i10 = ~i3;
        int i11 = ~(i8 | i10 | i6);
        int i12 = (~(i3 | i7)) | i8 | (~(i10 | i6));
        int i13 = i6 + i4 + i2 + (325770565 * i5) + ((-1284996642) * i);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i6) - 1205338112) + ((-1364710777) * i4) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i2) + ((-667418624) * i5) + ((-145752064) * i) + (1116340224 * i14);
        int i16 = (i6 * (-1991011123)) + 595473426 + (i4 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * TypedValues.Custom.TYPE_REFERENCE) + (i2 * (-1991010217)) + (i5 * (-1223611789)) + ((-291900814) * i) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        if (i17 == 1) {
            ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity = (ClaimOldDaySecurityWorkTerminationParticipantActivity) objArr[0];
            Bundle bundle = (Bundle) objArr[1];
            int i18 = 2 % 2;
            int i19 = d + 113;
            asInterface = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
                int i21 = ~i;
                if (i20 != 1104439208 + ((~(1179336491 | i21)) * 979) + ((i | 349348948) * (-979)) + (((~(i | 1179336491)) | (~(i21 | 349348948))) * 979)) {
                    int[] iArr = new int[2013174747];
                    iArr[2013174746] = 1;
                    int i22 = (-948416130) % 2;
                    Toast.makeText((Context) null, iArr[-1], 1).show();
                }
            } else {
                int i23 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
                int iMyPid = Process.myPid();
                if (i23 != 2047873600 + (((~((-1040467481) | iMyPid)) | 268437008) * 345) + (((~((-1040467481) | (~iMyPid))) | (-2138892032)) * 345) + ((~(iMyPid | (-268437009))) * 345)) {
                    int[] iArr2 = new int[2013174747];
                    iArr2[2013174746] = 1;
                    int i24 = (-948416130) % 2;
                    Toast.makeText((Context) null, iArr2[-1], 1).show();
                }
            }
            int i25 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
            int iMyPid2 = Process.myPid();
            if (i25 != (-1205616388) + (((~((-1851176535) | iMyPid2)) | 709002758) * 336) + (((~(iMyPid2 | 727879430)) | (-1870053207)) * (-168)) + (((~((~iMyPid2) | 727879430)) | (-1851176535)) * 168)) {
                int[] iArr3 = new int[1346013315];
                iArr3[1346013314] = 1;
                int i26 = (-1276319098) % 2;
                Toast.makeText((Context) null, iArr3[-1], 1).show();
                int i27 = d + 89;
                asInterface = i27 % 128;
                int i28 = i27 % 2;
            }
            super.onCreate(bundle);
            return null;
        }
        if (i17 != 2) {
            return i17 != 3 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity2 = (ClaimOldDaySecurityWorkTerminationParticipantActivity) objArr[0];
        int i29 = 2 % 2;
        ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub = claimOldDaySecurityWorkTerminationParticipantActivity2.INotificationSideChannelStub();
        TextInputLayout textInputLayout = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilOccupation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = claimOldDaySecurityWorkTerminationParticipantActivity2.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        claimOldDaySecurityWorkTerminationParticipantActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilDivisionWorkParticipant;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = claimOldDaySecurityWorkTerminationParticipantActivity2.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        claimOldDaySecurityWorkTerminationParticipantActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilNumberWorkAgreement;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = claimOldDaySecurityWorkTerminationParticipantActivity2.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        claimOldDaySecurityWorkTerminationParticipantActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilDateWorkAgreement;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = claimOldDaySecurityWorkTerminationParticipantActivity2.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        claimOldDaySecurityWorkTerminationParticipantActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout5 = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilNumberTerminationLetter;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string5 = claimOldDaySecurityWorkTerminationParticipantActivity2.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        claimOldDaySecurityWorkTerminationParticipantActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout6 = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilDateTerminationAnnouncement;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string6 = claimOldDaySecurityWorkTerminationParticipantActivity2.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        claimOldDaySecurityWorkTerminationParticipantActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        int i30 = d + 23;
        asInterface = i30 % 128;
        int i31 = i30 % 2;
        return null;
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
            int r7 = r7 + 4
            int r0 = 53 - r5
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r1[r7]
            int r3 = r3 + 1
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityWorkTerminationParticipantActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public static int b;

        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, IndividualDataClaim p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ClaimOldDaySecurityWorkTerminationParticipantActivity.class);
            intent.putExtra("individual_claim_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 7097781;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            b = i3;
            return i3;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityClaimOldDaySecurityWorkTerminationParticipantBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ClaimOldDaySecurityWorkTerminationParticipantActivity$bindingInflater$1 claimOldDaySecurityWorkTerminationParticipantActivity$bindingInflater$1 = ClaimOldDaySecurityWorkTerminationParticipantActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = asInterface + 13;
        d = i4 % 128;
        int i5 = i4 % 2;
        return claimOldDaySecurityWorkTerminationParticipantActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            final ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub = INotificationSideChannelStub();
            EditText editText = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilDateWorkAgreement.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: submitStillCaptures
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ClaimOldDaySecurityWorkTerminationParticipantActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub, view);
                    }
                });
            }
            EditText editText2 = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.tilDateTerminationAnnouncement.getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new View.OnClickListener() { // from class: preCapture
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ClaimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub, view);
                    }
                });
                int i3 = asInterface + 63;
                d = i3 % 128;
                int i4 = i3 % 2;
            }
            MaterialButton materialButton = activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub.btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: postCapture
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ClaimOldDaySecurityWorkTerminationParticipantActivity.b(activityClaimOldDaySecurityWorkTerminationParticipantBindingINotificationSideChannelStub, this, (View) obj);
                }
            }));
            return;
        }
        INotificationSideChannelStub().tilDateWorkAgreement.getEditText();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("individual_claim_data");
        Intrinsics.checkNotNull(parcelableExtra);
        this.a = (IndividualDataClaim) parcelableExtra;
        int i4 = d + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = d + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity = this;
        Intrinsics.checkNotNullParameter(claimOldDaySecurityWorkTerminationParticipantActivity, "");
        claimOldDaySecurityWorkTerminationParticipantActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_work_termination_statement));
        int i4 = d + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(false);
        int i4 = d + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity = (ClaimOldDaySecurityWorkTerminationParticipantActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = claimOldDaySecurityWorkTerminationParticipantActivity.INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(true);
        int i4 = asInterface + 25;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = asBinder;
        int i4 = -1870535734;
        long j = 0;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 107;
                $11 = i10 % 128;
                int i11 = i10 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int scrollBarSize = 3291 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int packedPositionGroup = 31 - ExpandableListView.getPackedPositionGroup(j);
                        byte b = (byte) ($$f & 7);
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, scrollBarSize, packedPositionGroup, 1948206109, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i2 = 2;
                    i4 = -1870535734;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asBinder;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i12]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1));
                    int pressedStateDuration = 3291 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i13 = 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b3 = (byte) ($$f & 7);
                    byte b4 = (byte) (-b3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, pressedStateDuration, i13, 1948206109, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i12++;
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i6;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i14] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                int i17 = $11 + 39;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    try {
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.argb(0, 0, 0, 0), View.MeasureSpec.getMode(0) + 2559, 29 - View.MeasureSpec.getSize(0), 683220507, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15 += 19;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2559 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), 683220507, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i15--;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - Color.green(0)), 349 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 25 - Gravity.getAbsoluteGravity(0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i20 = $11 + 113;
        $10 = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = d + 15;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = d + 73;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        char c;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
            int i3 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (bArr[27] - 1), bArr[28], bArr[3], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, maxKeyCode, i3, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c(bArr2[7], bArr2[28], (short) ($$b & 182), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, doubleTapTimeout, packedPositionType, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i5 = (((950188177 + ((((~(946342230 | i4)) | 60027400) | (~((-733739805) | i4))) * (-744))) + (((~i4) | 272629826) * 744)) + ((i4 | (-60027401)) * 744)) - 264450495;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{-123877409, 2025020454, -1647352754, 1530746018, 1081185968, -749617134, -2030593944, 1739278119, 1939570906, 1362967574}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-1522843392, 922880422, -1254433485, -207376926, -2120825818, 1191496089, 1824684448, -29172948, 643504432, -909293749}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_atm_bersama).substring(0, 4).length() + 12, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-401165634};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.getOffsetBefore("", 0) + 1726, Color.red(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -264450495, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                    int pressedStateDuration2 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(bArr3[7], bArr3[28], (short) ($$b & 182), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, pressedStateDuration, pressedStateDuration2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-1323609433, 1496960040, 1755592628, -1601956147, 2049999573, 909289288, 59637682, -1585300920, -2031739962, -1831599461, -2113157289, 823849403, -391069545, -562183745}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{584604280, 1639040218, 2033249153, -1007596826, 1183245577, -811893092, -2060606601, 621406681, -1849577095, -1219693150}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step3).substring(2, 3).codePointAt(0) - 93, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c4 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c(bArr4[7], bArr4[28], (short) 88, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, minimumFlingVelocity, trimmedLength, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                        int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                        int size = View.MeasureSpec.getSize(0) + 23;
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) (bArr5[27] - 1), bArr5[28], bArr5[3], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, iCombineMeasuredStates, size, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i12 = i10 + (-423213295) + (((~(379772530 | i11)) | 558637196) * 104) + ((~((~i11) | (-346034771))) * (-104)) + ((i11 | 592374956) * 104);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1042165763;
            int i16 = ~length;
            int i17 = i15 + (-1863831475) + (((~(length | (-731108222))) | (~((-271327363) | i16)) | 58724936) * (-68)) + ((~((-672383286) | i16)) * (-68)) + (((~(731108221 | i16)) | (-943710648)) * 68);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr14[3])[0] = i19 ^ (i19 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c5 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
            int iMyPid = 15 - (Process.myPid() >> 22);
            byte[] bArr6 = $$a;
            Object[] objArr15 = new Object[1];
            c(bArr6[7], bArr6[28], (short) 140, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c5, iLastIndexOf, iMyPid, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{-1323609433, 1496960040, 1755592628, -1601956147, 2049999573, 909289288, 59637682, -1585300920, -2031739962, -1831599461, -2113157289, 823849403, -391069545, -562183745}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klik_bca_continue).substring(39, 48).length() + 13, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{584604280, 1639040218, 2033249153, -1007596826, 1183245577, -811893092, -2060606601, 621406681, -1849577095, -1219693150}, TextUtils.getCapsMode("", 0, 0) + 15, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c6 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iIndexOf = 1031 - TextUtils.indexOf("", "");
            int defaultSize = 15 - View.getDefaultSize(0, 0);
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            c(bArr7[7], bArr7[28], (short) ($$b & 182), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c6, iIndexOf, defaultSize, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1031;
                int iGreen = 15 - Color.green(0);
                byte b = $$a[7];
                Object[] objArr19 = new Object[1];
                c((byte) 52, b, (short) (b | 192), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, packedPositionType2, iGreen, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr20[3])[0];
            int i21 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_copied_to_clipboard).substring(13, 14).codePointAt(0) - 1392026475;
            int i22 = ~((-936684491) | (~iCodePointAt));
            int i23 = ((((((-1070984171) | i22) | (~(936684490 | iCodePointAt))) * (-338)) - 971116765) + (((~(iCodePointAt | (-134299681))) | i22) * 338)) - 325858904;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
            int i26 = d + 83;
            asInterface = i26 % 128;
            int i27 = i26 % 2;
            c = 1;
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{-123877409, 2025020454, -1647352754, 1530746018, 1081185968, -749617134, -2030593944, 1739278119, 1939570906, 1362967574}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bbm_money).substring(0, 9).length() + 7, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{-1522843392, 922880422, -1254433485, -207376926, -2120825818, 1191496089, 1824684448, -29172948, 643504432, -909293749}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step6).substring(17, 18).codePointAt(0) - 81, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-401165634};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46037), TextUtils.indexOf("", "") + 1134, MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -325858904, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                int i28 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr8 = $$a;
                Object[] objArr25 = new Object[1];
                c(bArr8[7], bArr8[28], (short) 140, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, packedPositionGroup, i28, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 1118, ImageFormat.getBitsPerPixel(0) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int i29 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i30 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b2 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((byte) 52, b2, (short) (b2 | 192), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveOpacity, i29, i30, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-1323609433, 1496960040, 1755592628, -1601956147, 2049999573, 909289288, 59637682, -1585300920, -2031739962, -1831599461, -2113157289, 823849403, -391069545, -562183745}, 21 - MotionEvent.axisFromString(""), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{584604280, 1639040218, 2033249153, -1007596826, 1183245577, -811893092, -2060606601, 621406681, -1849577095, -1219693150}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_ecash).substring(0, 32).length() - 17, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr9[7], bArr9[28], (short) ($$b & 182), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb2, scrollDefaultDelay, iKeyCodeFromString, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int mirror = AndroidCharacter.getMirror('0') + 983;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c(bArr10[7], bArr10[28], (short) 140, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(pressedStateDuration3, mirror, maximumDrawingCacheSize, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                c = 1;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[c])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            int i33 = d + 43;
            asInterface = i33 % 128;
            int i34 = i33 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_instruction_step3).substring(104, 112).length() + 1078096592;
            int i38 = i35 + (-2140082559) + (((~(684364361 | length2)) | 387018162) * 336) + (((~(length2 | 928644531)) | 142737992) * (-168)) + (((~((~length2) | 928644531)) | 684364361) * 168);
            int i39 = i38 ^ (i38 << 13);
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i41 = d + 39;
            asInterface = i41 % 128;
            int i42 = i41 % 2;
            while (i2 < strArr4.length) {
                int i43 = d + 101;
                asInterface = i43 % 128;
                if (i43 % 2 == 0) {
                    arrayList2.add(strArr4[i2]);
                    i2 += 61;
                } else {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i32));
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            if (i3 != 502681552 + ((iIdentityHashCode | (-1650134626)) * 140) + (((~((-1650134626) | i4)) | 541196800) * (-280)) + (((~(iIdentityHashCode | (-541196801))) | (~(820147082 | i4)) | (-1929084908)) * 140)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 94484578;
            int i6 = ~iCodePointAt;
            if (i5 != (((~(1515025497 | i6)) | (~(iCodePointAt | 685037954))) * 959) + 201921547 + (((~(iCodePointAt | 1515025497)) | (~(i6 | 685037954))) * 959)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i7 != (-530249890) + (((~((~iFreeMemory) | (-574703198))) | (-2004352768)) * (-591)) + ((iFreeMemory | (-574703198)) * 591)) {
            throw new RuntimeException("-509146428");
        }
        super.onResume();
        int i8 = d + 99;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 39 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-1273806040) + ((234881232 | i5) * (-192)) + (((~(1067058129 | i5)) | 2189354) * (-384)) + (((~(iIdentityHashCode | (-832176898))) | (~(i5 | 1069247483)) | (~((-2189355) | iIdentityHashCode))) * DerHeader.TAG_CLASS_PRIVATE)) {
            throw null;
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode2;
        if (i6 != 161763228 + ((~(367501352 | i7)) * (-560)) + ((~(iIdentityHashCode2 | 2112879339)) * (-560)) + (((~((-2083412684) | i7)) | 338034696) * 560)) {
            throw null;
        }
        super.onStart();
        int i8 = d + 85;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(final ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity, final ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: isCaptureResultNeeded
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    ClaimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityClaimOldDaySecurityWorkTerminationParticipantBinding, i2, i3, i4);
                }
            }, claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(1), claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(2), claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(5));
            datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance().getTimeInMillis());
            datePickerDialog.show();
            ViewPortBuilder.b();
            int i2 = d + 61;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity, final ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getCameraCapturePipeline
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    ClaimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, activityClaimOldDaySecurityWorkTerminationParticipantBinding, i2, i3, i4);
                }
            }, claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.get(1), claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.get(2), claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.get(5));
            datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance().getTimeInMillis());
            datePickerDialog.show();
            ViewPortBuilder.b();
            int i2 = d + 11;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity, ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBinding, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 25;
        d = i5 % 128;
        int i6 = i5 % 2;
        claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(1, i);
        claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(2, i2);
        claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(5, i3);
        activityClaimOldDaySecurityWorkTerminationParticipantBinding.edtDateWorkAgreement.setText(claimOldDaySecurityWorkTerminationParticipantActivity.b.format(claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getTime()));
        int i7 = d + 11;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity, ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBinding, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = d + 15;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.set(1, i);
        claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        activityClaimOldDaySecurityWorkTerminationParticipantBinding.edtDateTerminationAnnouncement.setText(claimOldDaySecurityWorkTerminationParticipantActivity.b.format(claimOldDaySecurityWorkTerminationParticipantActivity.TuitionPaymentFragmentbindingInflater1.getTime()));
        int i7 = d + 27;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 32 / 0;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Editable text;
        ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBinding = (ActivityClaimOldDaySecurityWorkTerminationParticipantBinding) objArr[0];
        ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity = (ClaimOldDaySecurityWorkTerminationParticipantActivity) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        if (!activityClaimOldDaySecurityWorkTerminationParticipantBinding.cbAgreeTermCondition.isChecked()) {
            String string = claimOldDaySecurityWorkTerminationParticipantActivity.getString(R.string.message_agreed_tnc);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast toastMakeText = Toast.makeText(claimOldDaySecurityWorkTerminationParticipantActivity, string, 1);
            toastMakeText.show();
            Intrinsics.checkExpressionValueIsNotNull(toastMakeText, "");
            return Unit.INSTANCE;
        }
        IndividualDataClaim individualDataClaim = claimOldDaySecurityWorkTerminationParticipantActivity.a;
        IndividualDataClaim individualDataClaim2 = null;
        if (individualDataClaim == null) {
            int i2 = asInterface + 67;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                individualDataClaim2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            individualDataClaim = null;
        }
        String str = individualDataClaim.getItem;
        IndividualDataClaim individualDataClaim3 = claimOldDaySecurityWorkTerminationParticipantActivity.a;
        if (individualDataClaim3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            individualDataClaim3 = null;
        }
        String str2 = individualDataClaim3.isConnected;
        IndividualDataClaim individualDataClaim4 = claimOldDaySecurityWorkTerminationParticipantActivity.a;
        if (individualDataClaim4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            individualDataClaim4 = null;
        }
        String str3 = individualDataClaim4.getServiceComponent;
        IndividualDataClaim individualDataClaim5 = claimOldDaySecurityWorkTerminationParticipantActivity.a;
        if (individualDataClaim5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            individualDataClaim5 = null;
        }
        IndividualDataClaim individualDataClaim6 = new IndividualDataClaim(null, null, null, null, null, individualDataClaim5.asBinder, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 536870879, -1, 127, null);
        IndividualDataClaim individualDataClaim7 = claimOldDaySecurityWorkTerminationParticipantActivity.a;
        if (individualDataClaim7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = asInterface + 81;
            d = i3 % 128;
            int i4 = i3 % 2;
            individualDataClaim7 = null;
        }
        String str4 = individualDataClaim7.onConnected;
        EditText editText = activityClaimOldDaySecurityWorkTerminationParticipantBinding.tilOccupation.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = activityClaimOldDaySecurityWorkTerminationParticipantBinding.tilDivisionWorkParticipant.getEditText();
        if (editText2 != null) {
            int i5 = d + 95;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                text = editText2.getText();
                int i6 = 24 / 0;
            } else {
                text = editText2.getText();
            }
        } else {
            text = null;
        }
        String strValueOf2 = String.valueOf(text);
        EditText editText3 = activityClaimOldDaySecurityWorkTerminationParticipantBinding.tilNumberWorkAgreement.getEditText();
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = activityClaimOldDaySecurityWorkTerminationParticipantBinding.tilDateWorkAgreement.getEditText();
        String strValueOf4 = String.valueOf(editText4 != null ? editText4.getText() : null);
        EditText editText5 = activityClaimOldDaySecurityWorkTerminationParticipantBinding.tilNumberTerminationLetter.getEditText();
        String strValueOf5 = String.valueOf(editText5 != null ? editText5.getText() : null);
        EditText editText6 = activityClaimOldDaySecurityWorkTerminationParticipantBinding.tilDateTerminationAnnouncement.getEditText();
        String strValueOf6 = String.valueOf(editText6 != null ? editText6.getText() : null);
        IndividualDataClaim individualDataClaim8 = claimOldDaySecurityWorkTerminationParticipantActivity.a;
        if (individualDataClaim8 == null) {
            int i7 = d + 121;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            individualDataClaim2 = individualDataClaim8;
        }
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim6, null, null, null, null, null, null, "SKJ07", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str4, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, individualDataClaim2.MediaBrowserCompatMediaBrowserImplApi211, false, null, null, null, null, null, null, null, -65, -1073806849, 127, null);
        ClaimSubmissionActivity.Companion companion = ClaimSubmissionActivity.INSTANCE;
        ClaimSubmissionActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(claimOldDaySecurityWorkTerminationParticipantActivity, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ActivityClaimOldDaySecurityWorkTerminationParticipantBinding activityClaimOldDaySecurityWorkTerminationParticipantBinding, ClaimOldDaySecurityWorkTerminationParticipantActivity claimOldDaySecurityWorkTerminationParticipantActivity, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = zzo.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(zzo.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{activityClaimOldDaySecurityWorkTerminationParticipantBinding, claimOldDaySecurityWorkTerminationParticipantActivity, view}, iTuitionPaymentFragmentbindingInflater1, 1526000664, iTuitionPaymentFragmentbindingInflater3, -1526000664);
    }

    static {
        g = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f589a + 69;
        g = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_claim_old_day_security_work_termination_participant;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() throws IllegalAccessException {
        int iB = zzw.b();
        b(zzw.b(), zzo.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, iB, 657963484, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 750422617, -657963481);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() throws IllegalAccessException {
        int iB = zzw.b();
        int iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
        int iB2 = zzw.b();
        b(zzw.b(), iTuitionPaymentFragmentbindingInflater1, new Object[]{this}, iB, 1947987520, iB2, -1947987518);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int length = (-1338564731) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca2).substring(15, 16).length();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(5) + 1005051335;
        b(zzw.b(), iCodePointAt, new Object[]{this, bundle}, length, 1464404856, zzo.TuitionPaymentFragmentbindingInflater1(), -1464404855);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        asBinder = new int[]{388129630, -564616013, 1677897354, -359040816, -1257478253, 1682751453, 951146029, 39133805, 566376348, -65442727, -708741997, -1843372543, -432419738, -1757434007, -1673648840, -2038412247, 305563468, -541769500};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, int r6, byte r7) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity.$$c
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r5 = r5 * 56
            int r5 = 122 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
        L27:
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity.$$i(byte, int, byte):java.lang.String");
    }
}
